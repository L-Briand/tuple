package net.orandja.kt.tuple

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.CompositeEncoder

@Serializable(Tuple1.Serializer::class)
data class Tuple1<T1>(
    val first: T1
) : Tuple {
    class Serializer<T1>(
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
}

