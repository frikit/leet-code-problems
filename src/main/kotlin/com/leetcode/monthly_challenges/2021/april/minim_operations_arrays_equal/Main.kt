package com.leetcode.monthly_challenges.`2021`.april.minim_operations_arrays_equal

fun main() {
    println("Test case 1:")
    println(Solution().minOperations(3))//2
    println()
    println("Test case 2:")
    println(Solution().minOperations(6))//9
    println()
}

class Solution {
    fun minOperations(n: Int): Int {
        return n * n / 4
    }
}
