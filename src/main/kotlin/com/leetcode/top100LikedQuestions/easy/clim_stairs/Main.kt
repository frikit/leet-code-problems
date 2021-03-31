package com.leetcode.top100LikedQuestions.easy.clim_stairs

fun main() {
    println("Test case 1:")
    println(Solution().climbStairs(0))
    println()
    println("Test case 2:")
    println(Solution().climbStairs(1))
    println()
    println("Test case 3:")
    println(Solution().climbStairs(2))
    println()
    println("Test case 4:")
    println(Solution().climbStairs(3))
    println()
    println("Test case 5:")
    println(Solution().climbStairs(4))
    println()
    println("Test case 6:")
    println(Solution().climbStairs(5))
    println()
    println("Test case 7:")
    println(Solution().climbStairs(6))
    println()
    println("Test case 8:")
    println(Solution().climbStairs(44))
    println()

}

class Solution {
    val dp = IntArray(Short.MAX_VALUE.toInt())

    init {
        dp[1] = 1
        dp[2] = 2
        dp[3] = 3
        dp[4] = 5
        dp[5] = 8

        for (i in 5..100) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }
    }

    fun climbStairs(n: Int): Int {
        if (n == 0) return 0
        if (n == 1) return 1

        for (i in 100..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }
        return dp[n]
    }
}
