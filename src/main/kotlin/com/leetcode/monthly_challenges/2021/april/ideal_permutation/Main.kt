package com.leetcode.monthly_challenges.`2021`.april.ideal_permutation

fun main() {
    println("Test case 1:")
    println(Solution().isIdealPermutation(intArrayOf(1, 0, 2)))//true
    println()
    println("Test case 2:")
    println(Solution().isIdealPermutation(intArrayOf(1, 2, 0)))//false
    println()
}

class Solution {
    fun isIdealPermutation(a: IntArray): Boolean {
        var max = Int.MIN_VALUE
        var prev: Int = Int.MIN_VALUE
        a.forEach { e ->
            if (max > e) return false
            max = Math.max(max, prev)
            prev = e
        }

        return true
    }
}
