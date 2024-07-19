package net.orandja.kt.tuple

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

@Serializable(Tuple4.Serializer::class)
data class Tuple4<T1, T2, T3, T4>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
) : Tuple {
    class Serializer<T1, T2, T3, T4>(
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
}