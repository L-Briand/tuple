package net.orandja.kt.tuple

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

@Serializable(Tuple2.Serializer::class)
data class Tuple2<T1, T2>(
    val first: T1,
    val second: T2,
) : Tuple {
    class Serializer<T1, T2>(
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

}