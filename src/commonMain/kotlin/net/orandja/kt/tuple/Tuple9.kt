package net.orandja.kt.tuple

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

@Serializable(Tuple9.Serializer::class)
data class Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5,
    val sixth: T6,
    val seventh: T7,
    val eighth: T8,
    val ninth: T9,
) : Tuple {
    class Serializer<T1, T2, T3, T4, T5, T6, T7, T8, T9>(
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
}