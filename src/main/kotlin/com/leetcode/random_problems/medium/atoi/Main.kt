package com.leetcode.random_problems.medium.atoi

fun main() {
    println("Test case 1:")
    println(Solution().myAtoi("42")) // 42
    println()

    println("Test case 2:")
    println(Solution().myAtoi("   -42")) // -42
    println()

    println("Test case 3:")
    println(Solution().myAtoi("4193 with words")) // 4193
    println()

    println("Test case 4:")
    println(Solution().myAtoi("-91283472332")) // -2147483648
    println()

    println("Test case 5:")
    println(Solution().myAtoi("words and 987")) // 0
    println()

    println("Test case 6:")
    println(Solution().myAtoi("3.14159")) // 3
    println()

    println("Test case 7:")
    println(Solution().myAtoi("+-12")) // 0
    println()

    println("Test case 8:")
    println(Solution().myAtoi(".1")) // 0
    println()

}

class Solution {
    fun myAtoi(s: String): Int {
        if (s.trim().isEmpty()) return 0
        val isPositive = s.trim().first() != '-'
        var firstDigit = true
        var finalNumb = ""
        val isFirstSign = s.trim().first() == '+' || s.trim().first() == '-'
        val drop = if (isFirstSign) 1 else 0

        s.trim().drop(drop).takeWhile { it.isDigit() }.toCharArray().forEach {
            if (!it.isDigit() && !it.isWhitespace() && firstDigit) {
                return 0
            } else if (it.isDigit() && firstDigit) {
                finalNumb += it
                firstDigit = false
            } else if (it.isDigit() && finalNumb.isNotEmpty()) {
                finalNumb += it
                if (finalNumb.toBigInteger() !in Int.MIN_VALUE.toBigInteger()..Int.MAX_VALUE.toBigInteger()) {
                    return if (isPositive) {
                        Int.MAX_VALUE
                    } else {
                        Int.MIN_VALUE
                    }
                }
            } else if (!it.isDigit() && finalNumb.isNotEmpty() && !firstDigit) {
                return if (isPositive) finalNumb.toInt() else finalNumb.toInt() * -1
            }
        }
        if (finalNumb.isEmpty()) finalNumb = "0"

        return if (isPositive) finalNumb.toInt() else finalNumb.toInt() * -1
    }
}
