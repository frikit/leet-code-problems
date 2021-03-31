package com.leetcode.top100LikedQuestions.easy.max_sub_array_sum

fun main() {
    println("Test case 1:")
    println(Solution().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    println()
    println("Test case 2:")
    println(Solution().maxSubArray(intArrayOf(1)))
    println()
    println("Test case 3:")
    println(Solution().maxSubArray(intArrayOf(5, 4, -1, 7, 8)))
    println()

}

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var current = 0
        nums.forEach {
            current = Math.max(current + it, it)
            max = Math.max(max, current)
        }
        return max
    }
}
