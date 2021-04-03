package com.leetcode.monthly_challenges.`2021`.april.longest_valid_parentheses

fun main() {
    println("Test case 1:")
    println(Solution().longestValidParentheses("(()"))//2
    println()
    println("Test case 2:")
    println(Solution().longestValidParentheses(")()())"))//4
    println()
    println("Test case 3:")
    println(Solution().longestValidParentheses(""))//0
    println()
    println("Test case 4:")
    println(Solution().longestValidParentheses(")("))//0
    println()
    println("Test case 5:")
    println(Solution().longestValidParentheses("()(()"))//2
    println()
    println("Test case 6:")
    println(Solution().longestValidParentheses("()(())"))//6
    println()

}

class Solution {
    fun longestValidParentheses(s: String): Int {
        val dp = IntArray(s.length)
        var result = 0
        var leftCount = 0
        for (i in s.indices) {
            if (s[i] == '(') {
                leftCount++
            } else if (leftCount > 0) {
                dp[i] = dp[i - 1] + 2
                dp[i] += if (i - dp[i] >= 0) dp[i - dp[i]] else 0
                result = Math.max(result, dp[i])
                leftCount--
            }
        }
        return result
    }
}
