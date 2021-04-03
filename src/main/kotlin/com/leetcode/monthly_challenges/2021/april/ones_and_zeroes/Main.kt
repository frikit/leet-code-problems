package com.leetcode.monthly_challenges.`2021`.april.ones_and_zeroes

import kotlin.math.max

fun main() {
    println("Test case 1:")
    println(Solution().findMaxForm(arrayOf("10", "0001", "111001", "1", "0"), 5, 3)) //4
    println()
    println("Test case 2:")
    println(Solution().findMaxForm(arrayOf("10", "0", "1"), 1, 1)) //2
    println()
    println("Test case 3:")
    println(Solution().findMaxForm(arrayOf("10", "0001", "111001", "1", "0"), 4, 3)) //3
    println()

}

class Solution {
    fun findMaxForm(strs: Array<String>?, m: Int, n: Int): Int {
        if (strs == null || m < 0 || n < 0) return 0
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (str in strs) {
            val ones = str.chars().filter { num: Int -> num == '1'.toInt() }.count().toInt()
            val zeroes = str.length - ones
            for (i in m downTo zeroes) {
                for (j in n downTo ones) {
                    println(dp[i].contentToString())
                    dp[i][j] = max(dp[i][j], dp[i - zeroes][j - ones] + 1)
                }
            }
        }
        return dp[m][n]
    }
}
