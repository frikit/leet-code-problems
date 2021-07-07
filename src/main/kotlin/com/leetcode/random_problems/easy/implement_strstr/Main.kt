package com.leetcode.random_problems.easy.implement_strstr

fun main() {
    println("Test case 1:")
    println(Solution().strStr("hello", "ll")) // 2
    println()

    println("Test case 2:")
    println(Solution().strStr("aaaaa", "bba")) // -1
    println()

    println("Test case 3:")
    println(Solution().strStr("", "")) // 0
    println()

}

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0

        return haystack.indexOf(needle)
    }
}
