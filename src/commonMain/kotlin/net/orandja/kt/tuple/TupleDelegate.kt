package net.orandja.kt.tuple

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

abstract class Tuple1DelegateSerializer<K, T1>(
    t1Serializer: KSerializer<T1>
) : KSerializer<K> {
    private val delegate = Tuple1Serializer(t1Serializer)
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple1<T1>
    abstract fun fromTuple(tuple: Tuple1<T1>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}

abstract class Tuple2DelegateSerializer<K, T1, T2>(
    t1Serializer: KSerializer<T1>,
    t2Serializer: KSerializer<T2>
) : KSerializer<K> {
    private val delegate = Tuple2Serializer(t1Serializer, t2Serializer)
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple2<T1, T2>
    abstract fun fromTuple(tuple: Tuple2<T1, T2>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}

abstract class Tuple3DelegateSerializer<K, T1, T2, T3>(
    t1Serializer: KSerializer<T1>,
    t2Serializer: KSerializer<T2>,
    t3Serializer: KSerializer<T3>
) : KSerializer<K> {
    private val delegate = Tuple3Serializer(t1Serializer, t2Serializer, t3Serializer)
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple3<T1, T2, T3>
    abstract fun fromTuple(tuple: Tuple3<T1, T2, T3>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}


abstract class Tuple4DelegateSerializer<K, T1, T2, T3, T4>(
    t1Serializer: KSerializer<T1>,
    t2Serializer: KSerializer<T2>,
    t3Serializer: KSerializer<T3>,
    t4Serializer: KSerializer<T4>
) : KSerializer<K> {
    private val delegate = Tuple4Serializer(t1Serializer, t2Serializer, t3Serializer, t4Serializer)
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple4<T1, T2, T3, T4>
    abstract fun fromTuple(tuple: Tuple4<T1, T2, T3, T4>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}

abstract class Tuple5DelegateSerializer<K, T1, T2, T3, T4, T5>(
    t1Serializer: KSerializer<T1>,
    t2Serializer: KSerializer<T2>,
    t3Serializer: KSerializer<T3>,
    t4Serializer: KSerializer<T4>,
    t5Serializer: KSerializer<T5>
) : KSerializer<K> {
    private val delegate = Tuple5Serializer(t1Serializer, t2Serializer, t3Serializer, t4Serializer, t5Serializer)
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple5<T1, T2, T3, T4, T5>
    abstract fun fromTuple(tuple: Tuple5<T1, T2, T3, T4, T5>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}


abstract class Tuple6DelegateSerializer<K, T1, T2, T3, T4, T5, T6>(
    t1Serializer: KSerializer<T1>,
    t2Serializer: KSerializer<T2>,
    t3Serializer: KSerializer<T3>,
    t4Serializer: KSerializer<T4>,
    t5Serializer: KSerializer<T5>,
    t6Serializer: KSerializer<T6>
) : KSerializer<K> {
    private val delegate =
        Tuple6Serializer(t1Serializer, t2Serializer, t3Serializer, t4Serializer, t5Serializer, t6Serializer)
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple6<T1, T2, T3, T4, T5, T6>
    abstract fun fromTuple(tuple: Tuple6<T1, T2, T3, T4, T5, T6>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}

abstract class Tuple7DelegateSerializer<K, T1, T2, T3, T4, T5, T6, T7>(
    t1Serializer: KSerializer<T1>,
    t2Serializer: KSerializer<T2>,
    t3Serializer: KSerializer<T3>,
    t4Serializer: KSerializer<T4>,
    t5Serializer: KSerializer<T5>,
    t6Serializer: KSerializer<T6>,
    t7Serializer: KSerializer<T7>
) : KSerializer<K> {
    private val delegate = Tuple7Serializer(
        t1Serializer,
        t2Serializer,
        t3Serializer,
        t4Serializer,
        t5Serializer,
        t6Serializer,
        t7Serializer
    )
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple7<T1, T2, T3, T4, T5, T6, T7>
    abstract fun fromTuple(tuple: Tuple7<T1, T2, T3, T4, T5, T6, T7>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}

abstract class Tuple8DelegateSerializer<K, T1, T2, T3, T4, T5, T6, T7, T8>(
    t1Serializer: KSerializer<T1>,
    t2Serializer: KSerializer<T2>,
    t3Serializer: KSerializer<T3>,
    t4Serializer: KSerializer<T4>,
    t5Serializer: KSerializer<T5>,
    t6Serializer: KSerializer<T6>,
    t7Serializer: KSerializer<T7>,
    t8Serializer: KSerializer<T8>
) : KSerializer<K> {
    private val delegate = Tuple8Serializer(
        t1Serializer,
        t2Serializer,
        t3Serializer,
        t4Serializer,
        t5Serializer,
        t6Serializer,
        t7Serializer,
        t8Serializer
    )
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>
    abstract fun fromTuple(tuple: Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}

abstract class Tuple9DelegateSerializer<K, T1, T2, T3, T4, T5, T6, T7, T8, T9>(
    t1Serializer: KSerializer<T1>,
    t2Serializer: KSerializer<T2>,
    t3Serializer: KSerializer<T3>,
    t4Serializer: KSerializer<T4>,
    t5Serializer: KSerializer<T5>,
    t6Serializer: KSerializer<T6>,
    t7Serializer: KSerializer<T7>,
    t8Serializer: KSerializer<T8>,
    t9Serializer: KSerializer<T9>
) : KSerializer<K> {
    private val delegate = Tuple9Serializer(
        t1Serializer,
        t2Serializer,
        t3Serializer,
        t4Serializer,
        t5Serializer,
        t6Serializer,
        t7Serializer,
        t8Serializer,
        t9Serializer
    )
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>
    abstract fun fromTuple(tuple: Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}

abstract class Tuple10DelegateSerializer<K, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(
    t1Serializer: KSerializer<T1>,
    t2Serializer: KSerializer<T2>,
    t3Serializer: KSerializer<T3>,
    t4Serializer: KSerializer<T4>,
    t5Serializer: KSerializer<T5>,
    t6Serializer: KSerializer<T6>,
    t7Serializer: KSerializer<T7>,
    t8Serializer: KSerializer<T8>,
    t9Serializer: KSerializer<T9>,
    t10Serializer: KSerializer<T10>
) : KSerializer<K> {
    private val delegate = Tuple10Serializer(
        t1Serializer,
        t2Serializer,
        t3Serializer,
        t4Serializer,
        t5Serializer,
        t6Serializer,
        t7Serializer,
        t8Serializer,
        t9Serializer,
        t10Serializer
    )
    override val descriptor: SerialDescriptor = delegate.descriptor
    abstract fun toTuple(value: K): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>
    abstract fun fromTuple(tuple: Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>): K
    override fun deserialize(decoder: Decoder): K = fromTuple(delegate.deserialize(decoder))
    override fun serialize(encoder: Encoder, value: K) = delegate.serialize(encoder, toTuple(value))
}