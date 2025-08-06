package com.kimdoi.study.week02

class Quiz02 {
    fun runAll() {
        println("------ 문제 1 ------"); problem01()
        println("------ 문제 2 ------"); problem02()
        println("------ 문제 3 ------"); problem03()
        println("------ 문제 4 ------"); problem04()
        println("------ 문제 5 ------"); problem05()
        // 필요 시 문제 더 추가 가능
    }

    fun problem01() {
    }

    // 문제 2:
    fun problem02() {
    }

    // 문제 3:
    fun problem03() {
    }

    // 문제 4:
    fun problem04() {
        val name: String? = "Kotlin"
        println(name ?: "Unknown")
    }

    // 문제 5:
    fun problem05() {
        val result = "answer"
        println(result)
    }
}
