package com.leetcode.top100LikedQuestions.easy.best_time_to_buy_stocks

fun main() {
    println("Test case 1:")
    println(Solution().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))//5
    println()
    println("Test case 2:")
    println(Solution().maxProfit(intArrayOf(7, 6, 4, 3, 1)))//0
    println()
    println("Test case 3:")
    println(Solution().maxProfit(intArrayOf(2, 4, 1)))//2
    println()
    println("Test case 4:")
    println(Solution().maxProfit(intArrayOf(1, 2)))//1
    println()

}

class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0

        val n = prices.size
        var low = prices[0]
        val dp = IntArray(n)
        for (i in 1..prices.lastIndex) {
            if (prices[i] < low) {
                low = prices[i]
            }
            dp[i] = maxOf(dp[i - 1], prices[i] - low)
        }

        return dp[n - 1]
    }
}
