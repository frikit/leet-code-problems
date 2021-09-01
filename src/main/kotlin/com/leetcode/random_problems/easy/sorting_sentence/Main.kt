package com.leetcode.random_problems.easy.sorting_sentence

fun main() {
    println("Test case 1:")
    println(Solution().sortSentence("is2 sentence4 This1 a3"))
    println()

    println("Test case 2:")
    println(Solution().sortSentence("Myself2 Me1 I4 and3"))
    println()

}

class Solution {
    fun sortSentence(s: String): String {
        return s.split(" ").sortedBy { word -> word.last() }.map { word -> word.dropLast(1) }
            .joinToString(separator = " ")
    }
}
