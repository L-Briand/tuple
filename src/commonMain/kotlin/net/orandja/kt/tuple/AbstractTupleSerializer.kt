package net.orandja.kt.tuple

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.*

@OptIn(ExperimentalSerializationApi::class)
abstract class AbstractTupleSerializer<T>(vararg val descriptors: SerialDescriptor) : KSerializer<T> {
    override val descriptor: SerialDescriptor = TupleDescriptor(descriptors)

    fun <T> CompositeDecoder.decode(index: Int, serializer: KSerializer<T>): T {
        val componentDescriptor = descriptor.getElementDescriptor(index)
        return decodeSerializableElement(componentDescriptor, decodeElementIndex(componentDescriptor), serializer)
    }

    fun <T> CompositeEncoder.encode(index: Int, serializer: KSerializer<T>, value: T) {
        encodeSerializableElement(descriptor.getElementDescriptor(index), index, serializer, value)
    }

    override fun deserialize(decoder: Decoder): T = decoder.decodeStructure(descriptor) {
        deserializeTuple()
    }

    override fun serialize(encoder: Encoder, value: T) = encoder.encodeCollection(descriptor, descriptors.size) {
        serializeTuple(value)
    }

    abstract fun CompositeDecoder.deserializeTuple(): T
    abstract fun CompositeEncoder.serializeTuple(value: T)
}