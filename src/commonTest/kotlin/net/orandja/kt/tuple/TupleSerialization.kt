package net.orandja.kt.tuple

import kotlinx.serialization.*
import kotlinx.serialization.cbor.Cbor
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalSerializationApi::class)
class TupleSerialization {

    @Serializable
    data class TestData(val data: String)

    @Test
    fun serialize() {
        val data = tuple("a", 23, TestData("b"))
        assertJsonSerialization(data, """["a",23,{"data":"b"}]""")
        assertCborSerialization(data, "9f616117bf64646174616162ffff")
    }

    private inline fun <reified T> assertJsonSerialization(
        value: T,
        valueBytes: String,
        serializer: KSerializer<T> = serializer(),
        codec: Json = Json,
    ) {
        val encoded = codec.encodeToString(serializer, value)
        assertEquals(valueBytes, encoded)
        val decoded = codec.decodeFromString(serializer, encoded)
        assertEquals(value, decoded)
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
}