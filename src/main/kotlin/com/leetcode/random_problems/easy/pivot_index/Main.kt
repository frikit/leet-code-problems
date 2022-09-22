package com.leetcode.random_problems.easy.pivot_index

fun main() {
    println("Test case 1:")
    println(Solution().pivotIndex(intArrayOf(1, 7, 3, 6, 5, 6))) // 3
    println()

    println("Test case 2:")
    println(Solution().pivotIndex(intArrayOf(1, 2, 3))) // -1
    println()

    println("Test case 3:")
    println(Solution().pivotIndex(intArrayOf(2, 1, -1))) // 0
    println()

}

class Solution {
    fun pivotIndex(nums: IntArray): Int {
        var leftSum = 0
        var rightSum = nums.sum()
        nums.forEachIndexed { index, pivot ->
            rightSum -= pivot
            if (leftSum == rightSum) return index
            leftSum += pivot
        }

        return -1
    }
}
