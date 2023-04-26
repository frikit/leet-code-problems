package com.leetcode.top_interview_questions.easy.plus_one

fun main() {
    println("Test case 1:")
    println(Solution().plusOne(intArrayOf(1,2,3)).toList()) // [1,2,4]
    println()

    println("Test case 2:")
    println(Solution().plusOne(intArrayOf(4,3,2,1)).toList()) // [4,3,2,2]
    println()

    println("Test case 3:")
    println(Solution().plusOne(intArrayOf(9)).toList()) // [1,0]
    println()

    println("Test case 4:")
    println(Solution().plusOne(intArrayOf(9, 9)).toList()) // [1,0]
    println()
}

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.size - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }
        return intArrayOf(1, *digits)
    }
}
