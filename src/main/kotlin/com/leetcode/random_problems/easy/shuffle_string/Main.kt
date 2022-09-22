package com.leetcode.random_problems.easy.shuffle_string

fun main() {
    println("Test case 1:")
    println(Solution().restoreString("codeleet", listOf(4, 5, 6, 7, 0, 2, 1, 3).toIntArray())) // "leetcode"
    println()

    println("Test case 2:")
    println(Solution().restoreString("abc", listOf(0, 1, 2).toIntArray())) // "abc"
    println()

}

class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        val result = s.toCharArray()

        for (i in indices.indices) {
            val char = s[i]
            val index = indices[i]
            result[index] = char
        }

        return result.fold("") { first, second -> first + second.toString() }
    }
}
