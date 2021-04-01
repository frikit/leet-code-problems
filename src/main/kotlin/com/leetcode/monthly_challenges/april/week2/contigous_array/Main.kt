package com.leetcode.monthly_challenges.april.week2.contigous_array

import java.util.*


fun main() {
    println("Test case 1:")
    println(Solution().findMaxLength(intArrayOf(0, 1)).toString() + " == " + 2)
    println()

    println("Test case 2:")
    println(Solution().findMaxLength(intArrayOf(1, 0)).toString() + " == " + 0)
    println()

    println("Test case 3:")
    //because only one 0,1 in a row
    println(Solution().findMaxLength(intArrayOf(0, 1, 0)).toString() + " == " + 2)
    println()

    println("Test case 4:")
    //because 0,1 and 0,1 in a row
    println(Solution().findMaxLength(intArrayOf(0, 1, 0, 1)).toString() + " == " + 4)
    println()

    println("Test case 5:")
    println(Solution().findMaxLength(intArrayOf(0, 0, 0, 1, 1, 1, 0)).toString() + " == " + 6)
    println()

    println("Test case 5:")
    println(Solution().findMaxLength(intArrayOf(0, 1, 1, 0, 1, 1, 1, 0)).toString() + " == " + 4)
    println()

    println("Test case 6:")
    println(
        Solution().findMaxLength(
            intArrayOf(
                0,
                1,
                0,
                1,
                1,
                1,
                0,
                0,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                1,
                0,
                1,
                1,
                0,
                1,
                1,
                0,
                0,
                0,
                1,
                0,
                1,
                0,
                0,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                1,
                0,
                0,
                0,
                0,
                1,
                0,
                0,
                0,
                1,
                1,
                1,
                0,
                1,
                0,
                0,
                1,
                1,
                1,
                1,
                1,
                0,
                0,
                1,
                1,
                1,
                1,
                0,
                0,
                1,
                0,
                1,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                1,
                0,
                1,
                0,
                1,
                1,
                0,
                0,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                0,
                1,
                1,
                0,
                0,
                0,
                1,
                1
            )
        ).toString() + " == " + 68
    )
    println()
}

class Solution {
    fun findMaxLength(nums: IntArray): Int {
        val sumIdxMap: MutableMap<Int, Int> = HashMap()
        sumIdxMap[0] = -1
        var maxLen = 0
        var sum = 0
        nums.indices.forEach { i ->
            sum += if (nums[i] == 0) -1 else 1
            if (sumIdxMap.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - sumIdxMap.getOrDefault(sum, 0))
            } else {
                sumIdxMap[sum] = i
            }
        }
        return maxLen
    }
}
