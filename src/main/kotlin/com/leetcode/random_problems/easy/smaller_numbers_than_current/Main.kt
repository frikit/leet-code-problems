package com.leetcode.random_problems.easy.smaller_numbers_than_current

fun main() {
    println("Test case 1:")
    println(Solution().smallerNumbersThanCurrent(intArrayOf(8, 1, 2, 2, 3)).toList()) // 4,0,1,1,3
    println()

    println("Test case 2:")
    println(Solution().smallerNumbersThanCurrent(intArrayOf(6, 5, 4, 8)).toList()) // 2,1,0,3
    println()

    println("Test case 3:")
    println(Solution().smallerNumbersThanCurrent(intArrayOf(7, 7, 7, 7)).toList()) // 0,0,0,0
    println()

}

class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val sorted = nums.sorted()
        return nums.map { sorted.indexOf(it) }.toIntArray()
    }
}
