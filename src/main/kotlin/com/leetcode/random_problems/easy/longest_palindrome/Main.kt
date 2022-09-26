package com.leetcode.random_problems.easy.longest_palindrome

fun main() {
    println("Test case 1:")
    println(Solution().longestPalindrome("abccccdd")) // 7
    println()

    println("Test case 2:")
    println(Solution().longestPalindrome("a")) // 1
    println()

}

class Solution {
    fun longestPalindrome(s: String): Int {
        var res = 0
        var one = false
        if (s.length < 2) return s.length

        val counts = s.toCharArray().toList()
            .groupingBy { it }
            .eachCount()
            .map { it.value }
            .sortedDescending()

        counts.forEach { c ->
            var count = c
            while (count > 1) {
                res += 2
                count -= 2
            }
            if (count == 1 && !one) {
                res += 1
                one = true
            }
        }
        return res
    }
}
