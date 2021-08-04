package com.leetcode.learn.array101.sorted_squares

fun main() {
    println("Test case 1:")
    println(Solution().sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).toList()) // 0,1,9,16,100
    println()

    println("Test case 2:")
    println(Solution().sortedSquares(intArrayOf(-7, -3, 2, 3, 11)).toList()) // 4,9,9,49,121
    println()

}

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        return nums.map { it * it }.sorted().toIntArray()
    }
}
