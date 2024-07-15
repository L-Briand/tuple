package net.orandja.kt.tuple

import kotlin.test.Test
import kotlin.test.assertIs

class TupleExtTest {
    @Test
    fun testTupleExt() {
        val t1 = tuple(0)
        val t2 = t1 + 0.0
        val t4 = t2 + "hello" + 'c'
        assertIs<Tuple1<Int>>(t1)
        assertIs<Tuple2<Int, Double>>(t2)
        assertIs<Tuple4<Int, Double, String, Char>>(t4)
    }
}