package com.leetcode.top100LikedQuestions.easy.majority_element

fun main() {
    println("Test case 1:")
    println(Solution().majorityElement(intArrayOf(3, 2, 3)))
    println()
    println("Test case 2:")
    println(Solution().majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
    println()
    println("Test case 3:")
    println(Solution().majorityElement(intArrayOf(3, 3, 4)))
    println()

}

class Solution {
    fun majorityElement(nums: IntArray): Int {
        return nums.groupBy { it }.maxByOrNull { it.value.size }?.key ?: 0
    }
}
