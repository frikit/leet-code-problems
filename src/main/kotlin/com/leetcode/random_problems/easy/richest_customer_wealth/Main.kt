package com.leetcode.random_problems.easy.richest_customer_wealth

fun main() {
    println("Test case 1:")
    println(Solution().maximumWealth(arrayOf(intArrayOf(1, 2, 3), intArrayOf(3, 2, 1)))) // 6
    println()

    println("Test case 2:")
    println(Solution().maximumWealth(arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5)))) // 10
    println()

    println("Test case 3:")
    println(Solution().maximumWealth(arrayOf(intArrayOf(2, 8, 7), intArrayOf(7, 1, 3), intArrayOf(1, 9, 5)))) // 17
    println()

}

class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var richest = 0

        accounts.forEach { richest = Math.max(richest, it.sum()) }

        return richest
    }
}
