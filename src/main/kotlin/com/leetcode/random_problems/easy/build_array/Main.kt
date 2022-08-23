package com.leetcode.random_problems.easy.build_array

fun main() {
    println("Test case 1:")
    println(Solution().buildArray(listOf(0, 2, 1, 5, 3, 4).toIntArray()).toList()) // [0,1,2,4,5,3]
    println()

    println("Test case 2:")
    println(Solution().buildArray(listOf(5, 0, 1, 2, 3, 4).toIntArray()).toList()) // [4,5,0,1,2,3]
    println()

}

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val res = MutableList(nums.size) { 0 }
        nums.forEachIndexed { index, i -> res[index] = nums[i] }
        return res.toIntArray()
    }
}
