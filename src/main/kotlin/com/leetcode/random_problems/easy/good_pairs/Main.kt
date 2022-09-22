package com.leetcode.random_problems.easy.good_pairs

fun main() {
    println("Test case 1:")
    println(Solution().numIdenticalPairs(listOf(1, 2, 3, 1, 1, 3).toIntArray())) // 4
    println()

    println("Test case 2:")
    println(Solution().numIdenticalPairs(listOf(1, 1, 1, 1).toIntArray())) // 6
    println()

    println("Test case 3:")
    println(Solution().numIdenticalPairs(listOf(1, 2, 3).toIntArray())) // 0
    println()

}

class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        var goodPairs = 0
        nums.forEachIndexed { index, i ->
            nums.forEachIndexed { index2, j ->
                if (index != index2 && i == j && index < index2) {
                    goodPairs += 1
                }
            }
        }
        return goodPairs
    }
}
