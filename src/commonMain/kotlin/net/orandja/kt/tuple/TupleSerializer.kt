package net.orandja.kt.tuple

import kotlinx.serialization.KSerializer
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

class Tuple1Serializer<T1>(
    private val t1Serializer: KSerializer<T1>,
) : AbstractTupleSerializer<Tuple1<T1>>(
    t1Serializer.descriptor
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple1<T1> = tuple(
        decode(0, t1Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple1<T1>) {
        encode(0, t1Serializer, value.first)
    }
}

class Tuple2Serializer<T1, T2>(
    private val t1Serializer: KSerializer<T1>,
    private val t2Serializer: KSerializer<T2>,
) : AbstractTupleSerializer<Tuple2<T1, T2>>(
    t1Serializer.descriptor,
    t2Serializer.descriptor,
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple2<T1, T2> = tuple(
        decode(0, t1Serializer),
        decode(1, t2Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple2<T1, T2>) {
        encode(0, t1Serializer, value.first)
        encode(1, t2Serializer, value.second)
    }
}

class Tuple3Serializer<T1, T2, T3>(
    private val t1Serializer: KSerializer<T1>,
    private val t2Serializer: KSerializer<T2>,
    private val t3Serializer: KSerializer<T3>,
) : AbstractTupleSerializer<Tuple3<T1, T2, T3>>(
    t1Serializer.descriptor,
    t2Serializer.descriptor,
    t3Serializer.descriptor,
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple3<T1, T2, T3> = tuple(
        decode(0, t1Serializer),
        decode(1, t2Serializer),
        decode(2, t3Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple3<T1, T2, T3>) {
        encode(0, t1Serializer, value.first)
        encode(1, t2Serializer, value.second)
        encode(2, t3Serializer, value.third)
    }
}

class Tuple4Serializer<T1, T2, T3, T4>(
    private val t1Serializer: KSerializer<T1>,
    private val t2Serializer: KSerializer<T2>,
    private val t3Serializer: KSerializer<T3>,
    private val t4Serializer: KSerializer<T4>,
) : AbstractTupleSerializer<Tuple4<T1, T2, T3, T4>>(
    t1Serializer.descriptor,
    t2Serializer.descriptor,
    t3Serializer.descriptor,
    t4Serializer.descriptor,
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple4<T1, T2, T3, T4> = tuple(
        decode(0, t1Serializer),
        decode(1, t2Serializer),
        decode(2, t3Serializer),
        decode(3, t4Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple4<T1, T2, T3, T4>) {
        encode(0, t1Serializer, value.first)
        encode(1, t2Serializer, value.second)
        encode(2, t3Serializer, value.third)
        encode(3, t4Serializer, value.fourth)
    }
}

class Tuple5Serializer<T1, T2, T3, T4, T5>(
    private val t1Serializer: KSerializer<T1>,
    private val t2Serializer: KSerializer<T2>,
    private val t3Serializer: KSerializer<T3>,
    private val t4Serializer: KSerializer<T4>,
    private val t5Serializer: KSerializer<T5>,
) : AbstractTupleSerializer<Tuple5<T1, T2, T3, T4, T5>>(
    t1Serializer.descriptor,
    t2Serializer.descriptor,
    t3Serializer.descriptor,
    t4Serializer.descriptor,
    t5Serializer.descriptor,
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple5<T1, T2, T3, T4, T5> = tuple(
        decode(0, t1Serializer),
        decode(1, t2Serializer),
        decode(2, t3Serializer),
        decode(3, t4Serializer),
        decode(4, t5Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple5<T1, T2, T3, T4, T5>) {
        encode(0, t1Serializer, value.first)
        encode(1, t2Serializer, value.second)
        encode(2, t3Serializer, value.third)
        encode(3, t4Serializer, value.fourth)
        encode(4, t5Serializer, value.fifth)
    }
}

class Tuple6Serializer<T1, T2, T3, T4, T5, T6>(
    private val t1Serializer: KSerializer<T1>,
    private val t2Serializer: KSerializer<T2>,
    private val t3Serializer: KSerializer<T3>,
    private val t4Serializer: KSerializer<T4>,
    private val t5Serializer: KSerializer<T5>,
    private val t6Serializer: KSerializer<T6>,
) : AbstractTupleSerializer<Tuple6<T1, T2, T3, T4, T5, T6>>(
    t1Serializer.descriptor,
    t2Serializer.descriptor,
    t3Serializer.descriptor,
    t4Serializer.descriptor,
    t5Serializer.descriptor,
    t6Serializer.descriptor,
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple6<T1, T2, T3, T4, T5, T6> = tuple(
        decode(0, t1Serializer),
        decode(1, t2Serializer),
        decode(2, t3Serializer),
        decode(3, t4Serializer),
        decode(4, t5Serializer),
        decode(5, t6Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple6<T1, T2, T3, T4, T5, T6>) {
        encode(0, t1Serializer, value.first)
        encode(1, t2Serializer, value.second)
        encode(2, t3Serializer, value.third)
        encode(3, t4Serializer, value.fourth)
        encode(4, t5Serializer, value.fifth)
        encode(5, t6Serializer, value.sixth)
    }
}

class Tuple7Serializer<T1, T2, T3, T4, T5, T6, T7>(
    private val t1Serializer: KSerializer<T1>,
    private val t2Serializer: KSerializer<T2>,
    private val t3Serializer: KSerializer<T3>,
    private val t4Serializer: KSerializer<T4>,
    private val t5Serializer: KSerializer<T5>,
    private val t6Serializer: KSerializer<T6>,
    private val t7Serializer: KSerializer<T7>,
) : AbstractTupleSerializer<Tuple7<T1, T2, T3, T4, T5, T6, T7>>(
    t1Serializer.descriptor,
    t2Serializer.descriptor,
    t3Serializer.descriptor,
    t4Serializer.descriptor,
    t5Serializer.descriptor,
    t6Serializer.descriptor,
    t7Serializer.descriptor,
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple7<T1, T2, T3, T4, T5, T6, T7> = tuple(
        decode(0, t1Serializer),
        decode(1, t2Serializer),
        decode(2, t3Serializer),
        decode(3, t4Serializer),
        decode(4, t5Serializer),
        decode(5, t6Serializer),
        decode(6, t7Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple7<T1, T2, T3, T4, T5, T6, T7>) {
        encode(0, t1Serializer, value.first)
        encode(1, t2Serializer, value.second)
        encode(2, t3Serializer, value.third)
        encode(3, t4Serializer, value.fourth)
        encode(4, t5Serializer, value.fifth)
        encode(5, t6Serializer, value.sixth)
        encode(6, t7Serializer, value.seventh)
    }
}

class Tuple8Serializer<T1, T2, T3, T4, T5, T6, T7, T8>(
    private val t1Serializer: KSerializer<T1>,
    private val t2Serializer: KSerializer<T2>,
    private val t3Serializer: KSerializer<T3>,
    private val t4Serializer: KSerializer<T4>,
    private val t5Serializer: KSerializer<T5>,
    private val t6Serializer: KSerializer<T6>,
    private val t7Serializer: KSerializer<T7>,
    private val t8Serializer: KSerializer<T8>,
) : AbstractTupleSerializer<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>(
    t1Serializer.descriptor,
    t2Serializer.descriptor,
    t3Serializer.descriptor,
    t4Serializer.descriptor,
    t5Serializer.descriptor,
    t6Serializer.descriptor,
    t7Serializer.descriptor,
    t8Serializer.descriptor,
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> = tuple(
        decode(0, t1Serializer),
        decode(1, t2Serializer),
        decode(2, t3Serializer),
        decode(3, t4Serializer),
        decode(4, t5Serializer),
        decode(5, t6Serializer),
        decode(6, t7Serializer),
        decode(7, t8Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>) {
        encode(0, t1Serializer, value.first)
        encode(1, t2Serializer, value.second)
        encode(2, t3Serializer, value.third)
        encode(3, t4Serializer, value.fourth)
        encode(4, t5Serializer, value.fifth)
        encode(5, t6Serializer, value.sixth)
        encode(6, t7Serializer, value.seventh)
        encode(7, t8Serializer, value.eighth)
    }
}

class Tuple9Serializer<T1, T2, T3, T4, T5, T6, T7, T8, T9>(
    private val t1Serializer: KSerializer<T1>,
    private val t2Serializer: KSerializer<T2>,
    private val t3Serializer: KSerializer<T3>,
    private val t4Serializer: KSerializer<T4>,
    private val t5Serializer: KSerializer<T5>,
    private val t6Serializer: KSerializer<T6>,
    private val t7Serializer: KSerializer<T7>,
    private val t8Serializer: KSerializer<T8>,
    private val t9Serializer: KSerializer<T9>,
) : AbstractTupleSerializer<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>>(
    t1Serializer.descriptor,
    t2Serializer.descriptor,
    t3Serializer.descriptor,
    t4Serializer.descriptor,
    t5Serializer.descriptor,
    t6Serializer.descriptor,
    t7Serializer.descriptor,
    t8Serializer.descriptor,
    t9Serializer.descriptor,
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> = tuple(
        decode(0, t1Serializer),
        decode(1, t2Serializer),
        decode(2, t3Serializer),
        decode(3, t4Serializer),
        decode(4, t5Serializer),
        decode(5, t6Serializer),
        decode(6, t7Serializer),
        decode(7, t8Serializer),
        decode(8, t9Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>) {
        encode(0, t1Serializer, value.first)
        encode(1, t2Serializer, value.second)
        encode(2, t3Serializer, value.third)
        encode(3, t4Serializer, value.fourth)
        encode(4, t5Serializer, value.fifth)
        encode(5, t6Serializer, value.sixth)
        encode(6, t7Serializer, value.seventh)
        encode(7, t8Serializer, value.eighth)
        encode(8, t9Serializer, value.ninth)
    }
}

class Tuple10Serializer<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(
    private val t1Serializer: KSerializer<T1>,
    private val t2Serializer: KSerializer<T2>,
    private val t3Serializer: KSerializer<T3>,
    private val t4Serializer: KSerializer<T4>,
    private val t5Serializer: KSerializer<T5>,
    private val t6Serializer: KSerializer<T6>,
    private val t7Serializer: KSerializer<T7>,
    private val t8Serializer: KSerializer<T8>,
    private val t9Serializer: KSerializer<T9>,
    private val t10Serializer: KSerializer<T10>,
) : AbstractTupleSerializer<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>>(
    t1Serializer.descriptor,
    t2Serializer.descriptor,
    t3Serializer.descriptor,
    t4Serializer.descriptor,
    t5Serializer.descriptor,
    t6Serializer.descriptor,
    t7Serializer.descriptor,
    t8Serializer.descriptor,
    t9Serializer.descriptor,
    t10Serializer.descriptor,
) {
    override fun CompositeDecoder.deserializeTuple(): Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> = tuple(
        decode(0, t1Serializer),
        decode(1, t2Serializer),
        decode(2, t3Serializer),
        decode(3, t4Serializer),
        decode(4, t5Serializer),
        decode(5, t6Serializer),
        decode(6, t7Serializer),
        decode(7, t8Serializer),
        decode(8, t9Serializer),
        decode(9, t10Serializer)
    )

    override fun CompositeEncoder.serializeTuple(value: Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>) {
        encode(0, t1Serializer, value.first)
        encode(1, t2Serializer, value.second)
        encode(2, t3Serializer, value.third)
        encode(3, t4Serializer, value.fourth)
        encode(4, t5Serializer, value.fifth)
        encode(5, t6Serializer, value.sixth)
        encode(6, t7Serializer, value.seventh)
        encode(7, t8Serializer, value.eighth)
        encode(8, t9Serializer, value.ninth)
        encode(9, t10Serializer, value.tenth)
    }
}