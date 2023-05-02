package com.leetcode.top_interview_questions.easy.is_palendrme

fun main() {
    println("Test case 1:")
    println(Solution().isPalindrome("abba")) // true
    println()

    println("Test case 2:")
    println(Solution().isPalindrome("")) // true
    println()

}

class Solution {
    val letters = ('a'..'z').toSet()
    val numbers = ('0'..'9').toSet()
    val alphabet = letters + numbers
    fun isPalindrome(s: String): Boolean {
        val sanitized = s.toLowerCase().filter { alphabet.contains(it) }

        if (sanitized.isBlank()) return true
        if (sanitized.length == 2) return sanitized.first() == sanitized.last()

        var p1 = 0
        var p2 = sanitized.length - 1
        while (p1 != p2 && p1 < p2) {
            if (sanitized[p1] != sanitized[p2]) return false
            p1++
            p2--
        }

        return true
    }
}
