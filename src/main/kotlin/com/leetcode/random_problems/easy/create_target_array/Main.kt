package com.leetcode.random_problems.easy.create_target_array

fun main() {
    println("Test case 1:")
    println(Solution().createTargetArray(intArrayOf(0, 1, 2, 3, 4), intArrayOf(0, 1, 2, 2, 1)).toList()) // 0,4,1,3,2
    println()

    println("Test case 2:")
    println(Solution().createTargetArray(intArrayOf(1, 2, 3, 4, 0), intArrayOf(0, 1, 2, 3, 0)).toList()) // 0,1,2,3,4
    println()

    println("Test case 3:")
    println(Solution().createTargetArray(intArrayOf(1), intArrayOf(0)).toList()) // 1
    println()
}

class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val result = mutableListOf<Int>()

        index.forEachIndexed { idx, num ->
            result.add(num, nums[idx])
        }

        return result.toIntArray()
    }
}
