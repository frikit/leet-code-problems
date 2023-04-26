package com.leetcode.top_interview_questions.easy.sqrt_x

fun main() {
    println("Test case 1:")
    println(Solution().mySqrt(4)) // 2
    println()

    println("Test case 2:")
    println(Solution().mySqrt(8)) // 2.8... => 2
    println()
}

class Solution {
    fun mySqrt(x: Int): Int {
        var i = 0L
        while (!(i * i <= x && ((i + 1) * (i + 1)) > x)) i++
        return i.toInt()
    }
}
