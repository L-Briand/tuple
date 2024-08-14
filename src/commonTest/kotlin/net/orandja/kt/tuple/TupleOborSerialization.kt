package net.orandja.kt.tuple

import kotlinx.serialization.*
import net.orandja.obor.codec.Cbor
import kotlin.test.Test
import kotlin.test.assertEquals

class TupleOborSerialization {

    @Serializable
    data class TestData(val data: String)

    @Test
    fun serialize() {
        val data = tuple("a", 23, TestData("b"))
        assertCborSerialization(data, "83616117a164646174616162")
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