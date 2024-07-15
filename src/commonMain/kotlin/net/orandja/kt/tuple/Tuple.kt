package net.orandja.kt.tuple

import kotlinx.serialization.Serializable

interface Tuple

object Tuple0 : Tuple

@Serializable(Tuple1Serializer::class)
data class Tuple1<T1>(
    val first: T1
) : Tuple

@Serializable(Tuple2Serializer::class)
data class Tuple2<T1, T2>(
    val first: T1,
    val second: T2,
) : Tuple

@Serializable(Tuple3Serializer::class)
data class Tuple3<T1, T2, T3>(
    val first: T1,
    val second: T2,
    val third: T3,
) : Tuple

@Serializable(Tuple4Serializer::class)
data class Tuple4<T1, T2, T3, T4>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
) : Tuple

@Serializable(Tuple5Serializer::class)
data class Tuple5<T1, T2, T3, T4, T5>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5,
) : Tuple

@Serializable(Tuple6Serializer::class)
data class Tuple6<T1, T2, T3, T4, T5, T6>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5,
    val sixth: T6,
) : Tuple

@Serializable(Tuple7Serializer::class)
data class Tuple7<T1, T2, T3, T4, T5, T6, T7>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5,
    val sixth: T6,
    val seventh: T7,
) : Tuple

@Serializable(Tuple8Serializer::class)
data class Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5,
    val sixth: T6,
    val seventh: T7,
    val eighth: T8,
) : Tuple

@Serializable(Tuple9Serializer::class)
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
) : Tuple

@Serializable(Tuple10Serializer::class)
data class Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>(
    val first: T1,
    val second: T2,
    val third: T3,
    val fourth: T4,
    val fifth: T5,
    val sixth: T6,
    val seventh: T7,
    val eighth: T8,
    val ninth: T9,
    val tenth: T10,
) : Tuple