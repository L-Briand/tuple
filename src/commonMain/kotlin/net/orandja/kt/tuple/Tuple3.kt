package net.orandja.kt.tuple

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

@Serializable(Tuple3.Serializer::class)
data class Tuple3<T1, T2, T3>(
    val first: T1,
    val second: T2,
    val third: T3,
) : Tuple {
    class Serializer<T1, T2, T3>(
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
}
