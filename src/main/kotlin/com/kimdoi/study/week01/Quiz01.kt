package com.kimdoi.study.week01

class Quiz01 {
    fun runAll() {
        println("------ 문제 1 ------"); problem01()
        println("------ 문제 2 ------"); problem02()
        println("------ 문제 3 ------"); problem03()
        println("------ 문제 4 ------"); problem04()
        println("------ 문제 5 ------"); problem05()
        println("------ 문제 6 ------"); problem06()
        println("------ 문제 7 ------"); problem07()
        println("------ 문제 8 ------"); problem08()
        println("------ 문제 9 ------"); println(problem09(89))
        println("------ 문제 10 ------"); problem10()
        println("------ 문제 11 ------"); problem11()
        println("------ 문제 12 ------"); problem12()
        println("------ 문제 13 ------"); problem13()
        println("------ 문제 14 ------"); problem14()
        println("------ 문제 15 ------"); problem15()
        println("------ 문제 16 ------"); problem16()
        println("------ 문제 17 ------"); problem17()

    }

    // 문제 1: 다음 코드의 출력 결과는?
    fun problem01() {
        val a = 5
        val b = 2.5
        println(a + b) // 출력 결과를 예상: 7.5
    }

    // 문제 2: 다음 코드의 결과는?
    fun problem02() {
        val s = "Kotlin"
        println("Hello $s!") // Hello Kotlin!
        println("Hello Kotlin!")
    }

    // 문제 3: 아래 코드에서 사용된 타입은 무엇인가요?
    fun problem03() {
        val isDone = false
        println("타입: boolean")
    }

    // 문제 4: Char 타입으로 한 글자 'A'를 변수로 선언하세요.
    fun problem04() {
         val ch: Char = 'A'
        println(ch)
    }

    // 문제 5: val x = 1.23 은 어떤 타입으로 추론되나요?
    fun problem05() {
        val x = 1.23
        println("타입: Double")
    }

    // 문제 6: Int의 최대값을 저장하는 상수는 무엇인가요?
    fun problem06() {
         println(Int.MAX_VALUE)
    }

    // 문제 7: 삼중 큰따옴표를 사용하면 어떤 장점이 있나요?
    fun problem07() {
        val text = """
            abcd
        """
        println(text)
        println("장점: 줄바꿈, 따옴표, 이스케이프 문자 없이 여러 줄 문자열 작성 가능")
    }

    // 문제 8: 오류 없이 출력되도록 수정하세요.
    fun problem08() {
        val x = 1
        println("Value is: $x + 1")
        println("Value is: ${x + 1}") // 수정

    }

    // 문제 9: 점수에 따른 등급 출력 (점수가 90점 이상이면 A, 80점 이상이면 B, 아니면 C)
    fun problem09(score: Int): String {
        val result = if (score >= 90) "A"
        else if (score >= 80) "B"
        else "C"
        return result
    }


    // 문제 10: 아래 코드를 for문으로 바꾸세요.
    fun problem10() {
        for (i in 1..3) {
            println(i)
        }
    }

    // 문제 11: while 반복문이 몇 번 반복되는지 예측하세요.
    fun problem11() {
        var cnt = 0
        while (cnt < 4) {
            print("반복 ")
            cnt++
        }
        println(cnt)
        // 예측: 4번
    }

    // 문제 12: 1부터 10까지 짝수만 출력
    fun problem12() {
        // 반복문을 사용해 짝수만 출력해보세요.
        for (i in 1..10) {
            if (i % 2 == 0) {
                println(i)
            }
        }
    }

    // 문제 13: "a"가 몇 번 등장하는지 세기
    fun problem13() {
        val s = "banana"
        // 문자열 s에서 'a'가 몇 번 등장하는지 세어 출력하세요.
        var cnt = 0
        for (c in s) {
            if(c == 'a') {
                cnt++
            }
        }
        println(cnt) // 3번
    }

    // 문제 14: for 루프를 사용해 1 4 9 16 25 출력
    fun problem14() {
        for (i in 1..5) {
            print(i * i)
            print(" ")
        }
        println()
    }

    // 문제 15: 다음 코드의 결과를 예측하세요
    fun problem15() {
        val n = 7
        val result = if (n % 2 == 0) "even" else "odd"
        println(result)
        // 결과 예측: odd
    }

    // 문제 16: 1부터 10까지 더한 합
    fun problem16() {
        var sumVal = 0
        for (i in 1..10) {
            sumVal += i
        }
        println(sumVal)
    }

    // 문제 17: 10에서 1까지 거꾸로 출력하는 for문
    fun problem17() {
        for (i in 10 downTo 1) {
            print(i)
            print(" ")
        }
    }
}
