package com.leetcode.random_problems.easy.best_buy_sell_stock

fun main() {
    println("Test case 1:")
    println(Solution().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))) // 5
    println()

    println("Test case 2:")
    println(Solution().maxProfit(intArrayOf(7, 6, 4, 3, 1))) // 0
    println()

    println("Test case 3:")
    println(Solution().maxProfit(intArrayOf(2, 4, 1))) // 2
    println()

    println("Test case 4:")
    println(Solution().maxProfit(intArrayOf(1, 2, 3, 4, 5))) // 4
    println()

}

class Solution {
    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0
        var min = prices.first()
        var max = Short.MIN_VALUE.toInt()
        var maxProfit = 0

        prices.forEach {
            if (it < min) {
                min = Math.min(min, it)
                max = Short.MIN_VALUE.toInt()
            } else {
                max = Math.max(max, it)
            }

            maxProfit = Math.max(maxProfit, max - min)
        }

        return maxProfit
    }
}
