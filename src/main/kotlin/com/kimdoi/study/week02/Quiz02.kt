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

    // 문제 2:
    fun problem02() {
    }

    // 문제 3:
    fun problem03() {
    }

    // 문제 4:
    fun problem04() {
    }

    // 문제 5:
    fun problem05() {
    }
}
