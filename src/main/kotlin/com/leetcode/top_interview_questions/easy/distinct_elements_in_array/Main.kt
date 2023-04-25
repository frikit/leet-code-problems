package com.leetcode.top_interview_questions.easy.distinct_elements_in_array

fun main() {
    println("Test case 1:")
    val arr1 = intArrayOf(1, 1)
    println(Solution().removeDuplicates(arr1)) // 1
    println(arr1.contentToString())
    println()

    println("Test case 2:")
    val arr2 = intArrayOf(1, 1, 2)
    println(Solution().removeDuplicates(arr2)) // 2
    println(arr2.contentToString())
    println()
}

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        return nums.distinct().mapIndexed { i, n -> nums[i] = n }.size
    }
}
