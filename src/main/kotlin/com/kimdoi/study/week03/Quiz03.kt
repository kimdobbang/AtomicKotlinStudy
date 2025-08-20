package com.kimdoi.study.week03
import javax.swing.plaf.synth.SynthTextAreaUI
import kotlin.math.PI


class Quiz03 {
    fun runAll() {
        println("------ 문제 1 ------"); problem01()
        println("------ 문제 2 ------"); problem02()
        println("------ 문제 3 ------"); problem03()
        println("------ 문제 4 ------"); problem04()
        println("------ 문제 5 ------"); problem05()
        println("------ 문제 6 ------"); problem06()
        println("------ 문제 7 ------"); problem07()
        println("------ 문제 8 ------"); problem08()
        // 필요 시 문제 더 추가 가능
    }

    // 1.https://dmoj.ca/problem/ccc18s1
    fun problem01() {
        val br = System.`in`.bufferedReader()
        val n = br.readLine().toInt()
        val arr = IntArray(n) {br.readLine().trim().toInt()}
        arr.sort()

        var minVal = Double.POSITIVE_INFINITY
        for (i in 1 until n - 1) {
            val size = (arr[i + 1] - arr[i - 1]) / 2.0
            if (size < minVal) {
                minVal = size
            }
        }
        println("%.1f".format(minVal))
    }

    // 2.https://dmoj.ca/problem/ecoo17r1p1
    fun problem02() {
    }

    // 3.https://dmoj.ca/problem/ecoo17r3p1
    fun problem03() {
    }

    // 4.https://dmoj.ca/problem/ecoo19r2p1
    fun problem04() {
    }

    // 5.https://dmoj.ca/problem/cco99p2
    fun problem05() {
    }

    // 6.https://dmoj.ca/problem/coci15c2p1
    fun problem06() {
    }

    // 7.https://dmoj.ca/problem/crci06p1
    fun problem07() {
    }

    // 8.https://dmoj.ca/problem/coci17c2p2
    fun problem08() {
    }
}
