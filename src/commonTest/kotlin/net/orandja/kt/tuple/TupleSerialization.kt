package net.orandja.kt.tuple

import kotlinx.serialization.*
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class TupleSerialization {
    @Test
    fun serialize() {
        run {
            val data = tuple("a", 23)
            assertJsonSerialization(data, """["a",23]""")
            assertCborSerialization(data, "9f616117ff")
        }
        run {
            val data = tuple(1, 23)
            assertJsonSerialization(data, """[1,23]""")
            assertCborSerialization(data, "9f0117ff")
        }
    }

    @Serializable
    data class CustomClass(val user: String, val age: Int) {
        object AsTupleSerializer :
            Tuple2DelegateSerializer<CustomClass, String, Int>(String.serializer(), Int.serializer()) {
            override fun toTuple(value: CustomClass): Tuple2<String, Int> = tuple(value.user, value.age)
            override fun fromTuple(tuple: Tuple2<String, Int>): CustomClass = CustomClass(tuple.first, tuple.second)
        }
    }

    @Test
    fun customClass() {
        val data = CustomClass("john", 23)
        assertJsonSerialization(data, """{"user":"john","age":23}""")
        assertCborSerialization(data, "bf6475736572646a6f686e6361676517ff")
        assertJsonSerialization(data, """["john",23]""", CustomClass.AsTupleSerializer)
        assertCborSerialization(data, "9f646a6f686e17ff", CustomClass.AsTupleSerializer)
    }

    private inline fun <reified T> assertCborSerialization(
        value: T,
        valueBytes: String,
        serializer: KSerializer<T> = serializer(),
        cbor: Cbor = Cbor,
    ) {
        val encoded = cbor.encodeToHexString(serializer, value)
        assertEquals(valueBytes, encoded)
        val decoded = cbor.decodeFromHexString(serializer, encoded)
        assertEquals(value, decoded)
    }

    private inline fun <reified T> assertJsonSerialization(
        value: T,
        valueBytes: String,
        serializer: KSerializer<T> = serializer(),
        json: Json = Json,
    ) {
        val encoded = json.encodeToString(serializer, value)
        assertEquals(valueBytes, encoded)
        val decoded = json.decodeFromString(serializer, encoded)
        assertEquals(value, decoded)
    }
}