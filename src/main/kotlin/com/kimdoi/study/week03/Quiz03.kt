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
        val br = System.`in`.bufferedReader()

        // 학년별 비용
        val prices = intArrayOf(12, 10, 7, 5)

        repeat (10) {
            val cost = br.readLine().trim().toInt() // 여행 경비
            val perc = br.readLine().trim().split(" ").map { it.toDouble() } // 학년변 비율 - 컬렉션 활용
            val n = br.readLine().trim().toInt() // 전체 인원 수

            // 1. 각 학년별 인원수 구하기(총 합 == n 될 때 까지)
            var students = IntArray(4)
            //val students = IntArray(4) {i -> (perc[i] * n).toInt()} // 컬렉션 활용 (익숙치 않다)
            for (i in 0 until 4) {
                students[i] = (perc[i] * n).toInt()
            }

            // 2. 학년별 인원 합 확인하여 부동소수점으로 인해 인원 총합이 맞지 않는다면 가장 큰 비율 학년++
            val diff = n - students.sum()
//            var maxPercIdx = 0
            var maxpercVal : Double= 0.0

            if (diff != 0) {
                val maxIdx = perc.indices.maxByOrNull { perc[it]} !! // 컬렉션
//                for (i in 0 until 3) {
//                    if (perc[i] > maxpercVal) {
//                        maxpercVal = perc[i]
//                        maxPercIdx = i
//                    }
//                }
                students[maxIdx] += diff
//                students[maxPercIdx] += diff
            }

            // 3. 학년별 인원수 * 학년별 금액의 총합 구하기
            val revenue = (0 until 4).sumOf { i -> students[i] * prices[i] } // 컬렉션
//            var revenue = 0
//            for (i in 0 until 4) {
//                revenue += prices[i] * students[i]
//            }

            // 4. 총 경비 예산이 총합 / 2 보다 큰지 작은지 판단(자금 조달 여부)
            println(if (revenue < 2 * cost) "YES" else "NO")
        }
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
