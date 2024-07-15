package net.orandja.kt.tuple

fun tuple() = Tuple0

fun <T1> tuple(
    first: T1
) = Tuple1(first)

fun <T1, T2> tuple(
    first: T1, second: T2
) = Tuple2(first, second)

fun <T1, T2, T3> tuple(
    first: T1, second: T2, third: T3
) = Tuple3(first, second, third)

fun <T1, T2, T3, T4> tuple(
    first: T1, second: T2, third: T3, fourth: T4
) = Tuple4(first, second, third, fourth)

fun <T1, T2, T3, T4, T5> tuple(
    first: T1, second: T2, third: T3, fourth: T4, fifth: T5
) = Tuple5(first, second, third, fourth, fifth)

fun <T1, T2, T3, T4, T5, T6> tuple(
    first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6
) = Tuple6(first, second, third, fourth, fifth, sixth)

fun <T1, T2, T3, T4, T5, T6, T7> tuple(
    first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7
) = Tuple7(first, second, third, fourth, fifth, sixth, seventh)

fun <T1, T2, T3, T4, T5, T6, T7, T8> tuple(
    first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8
) = Tuple8(first, second, third, fourth, fifth, sixth, seventh, eighth)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> tuple(
    first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9
) = Tuple9(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> tuple(
    first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10
) = Tuple10(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth)


operator fun <T1> Tuple0.plus(value: T1) =
    tuple(value)

operator fun <T1, T2> Tuple1<T1>.plus(value: T2) =
    tuple(first, value)

operator fun <T1, T2, T3> Tuple2<T1, T2>.plus(value: T3) =
    tuple(first, second, value)

operator fun <T1, T2, T3, T4> Tuple3<T1, T2, T3>.plus(value: T4) =
    tuple(first, second, third, value)

operator fun <T1, T2, T3, T4, T5> Tuple4<T1, T2, T3, T4>.plus(value: T5) =
    tuple(first, second, third, fourth, value)

operator fun <T1, T2, T3, T4, T5, T6> Tuple5<T1, T2, T3, T4, T5>.plus(value: T6) =
    tuple(first, second, third, fourth, fifth, value)

operator fun <T1, T2, T3, T4, T5, T6, T7> Tuple6<T1, T2, T3, T4, T5, T6>.plus(value: T7) =
    tuple(first, second, third, fourth, fifth, sixth, value)

operator fun <T1, T2, T3, T4, T5, T6, T7, T8> Tuple7<T1, T2, T3, T4, T5, T6, T7>.plus(value: T8) =
    tuple(first, second, third, fourth, fifth, sixth, seventh, value)

operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>.plus(value: T9) =
    tuple(first, second, third, fourth, fifth, sixth, seventh, eighth, value)

operator fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>.plus(value: T10) =
    tuple(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, value)