package net.orandja.kt.tuple

// @formatter:off

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


fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> tuple(
    first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11
) = Tuple11(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh)

fun <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> tuple(
    first: T1, second: T2, third: T3, fourth: T4, fifth: T5, sixth: T6, seventh: T7, eighth: T8, ninth: T9, tenth: T10, eleventh: T11, twelfth: T12
) = Tuple12(first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh, twelfth)

// @formatter:on