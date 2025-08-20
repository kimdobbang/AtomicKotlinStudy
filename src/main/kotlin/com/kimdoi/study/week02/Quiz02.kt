package com.kimdoi.study.week02
import kotlin.math.PI


class Quiz02 {
    fun runAll() {
        println("------ 문제 1 ------"); problem01()
        println("------ 문제 2 ------"); problem02()
        println("------ 문제 3 ------"); problem03()
        println("------ 문제 4 ------"); problem04()
        println("------ 문제 5 ------"); problem05()
        // 필요 시 문제 더 추가 가능
    }

    // 1.https://dmoj.ca/problem/dmopc14c5p1
    fun problem01() {
        val br = System.`in`.bufferedReader()
        val r = br.readLine().toDouble()
        val h = br.readLine().toDouble()

        val v = (PI * r * r * h) / 3
        System.out.printf("%.2f", v)
        System.out.println()
    }

    // 2.https://dmoj.ca/problem/ccc19j1
    fun problem02() {
    }

    // 3.https://dmoj.ca/problem/ccc18j1
    fun problem03() {
    }

    // 4.https://dmoj.ca/problem/coci06c5p1
    fun problem04() {
    }

    // 5.https://dmoj.ca/problem/ccc18j2
    fun problem05() {
    }

    // 6.https://dmoj.ca/problem/coci16c1p1
    fun problem06() {
    }

    // 7.https://dmoj.ca/problem/ccc00s1
    fun problem07() {
    }

    // 8.https://dmoj.ca/problem/ccc08j2
    fun problem08() {
    }
}
