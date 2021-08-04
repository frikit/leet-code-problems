package com.leetcode.learn.array101.max_consecutive_ones

fun main() {
    println("Test case 1:")
    println(Solution().findMaxConsecutiveOnes(intArrayOf(1, 1, 0, 1, 1, 1))) // 3
    println()

    println("Test case 2:")
    println(Solution().findMaxConsecutiveOnes(intArrayOf(0))) // 0
    println()

}

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var consecutive = 0
        var result = 0
        var prev = -1

        nums.forEach { num ->
            println("Num: $num, Consecutive: $consecutive, Previous: $prev")
            when (prev) {
                num -> {
                    consecutive++
                }
                else -> {
                    prev = num
                    consecutive = 1
                }
            }

            if (prev > 0) result = Math.max(consecutive, result)
        }

        return result
    }
}
