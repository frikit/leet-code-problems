package com.leetcode.top_interview_questions.easy.longest_common_prefix

fun main() {
    println("Test case 1:")
    println(Solution().longestCommonPrefix(arrayOf("flower", "flow", "flight"))) // "fl
    println()

    println("Test case 2:")
    println(Solution().longestCommonPrefix(arrayOf("dog", "racecar", "car"))) // ""
    println()
}

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val head = strs.first().toCharArray()
        val tail = strs.drop(1).map { it.toCharArray() }
        return head.mapIndexed { index, c ->
            val values = tail.map { it.getOrElse(index) { '=' } }
            c to values.all { it == c }
        }
            .takeWhile { it.second }
            .map { it.first }
            .joinToString(separator = "")
    }
}
