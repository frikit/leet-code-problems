package com.leetcode.random_problems.easy.maximum_product_in_array

fun main() {
    println("Test case 1:")
//    Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
//    The product difference is (6 * 7) - (2 * 4) = 34.
    println(Solution().maxProductDifference(intArrayOf(5, 6, 2, 7, 4))) // 34
    println()

    println("Test case 2:")
//    Explanation: We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
//    The product difference is (9 * 8) - (2 * 4) = 64.
    println(Solution().maxProductDifference(intArrayOf(4, 2, 5, 9, 7, 4, 8))) // 64
    println()


}

class Solution {
    fun maxProductDifference(nums: IntArray): Int {
        val pairs = nums.sortedDescending().zipWithNext()
        val maxProduct = pairs.first().first * pairs.first().second
        val minProduct = pairs.last().first * pairs.last().second

        return maxProduct - minProduct
    }
}
