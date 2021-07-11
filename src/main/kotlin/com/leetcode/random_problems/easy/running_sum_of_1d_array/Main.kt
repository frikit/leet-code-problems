package com.leetcode.random_problems.easy.running_sum_of_1d_array

fun main() {
    println("Test case 1:")
    println(Solution().runningSum(intArrayOf(1, 2, 3, 4)).toList()) // [1,3,6,10]
    println()

    println("Test case 2:")
    println(Solution().runningSum(intArrayOf(1, 1, 1, 1, 1)).toList()) // [1,2,3,4,5]
    println()

    println("Test case 3:")
    println(Solution().runningSum(intArrayOf(3, 1, 2, 10, 1)).toList()) // [3,4,6,16,17]
    println()

}

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        if (nums.size <= 1) return nums

        val currentSums = IntArray(nums.size)
        currentSums[0] = nums[0]

        nums.forEachIndexed { idx, num ->
            if (idx > 0)
                currentSums[idx] = currentSums[idx - 1] + num
        }

        return currentSums
    }
}
