package com.leetcode.random_problems.easy.longest_common_prefix

fun main() {
    println("Test case 1:")
    println(Solution().longestCommonPrefix(arrayOf("flower", "flow", "flight"))) // fl
    println()

    println("Test case 2:")
    println(Solution().longestCommonPrefix(arrayOf("dog", "racecar", "car"))) // empty
    println()

    println("Test case 3:")
    println(Solution().longestCommonPrefix(arrayOf())) // empty
    println()

}

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""

        repeat(200) {
            val firstLetter =
                strs.map { element -> if (element.isBlank() || element.length <= it) "" else element[it].toString() }
                    .distinct()

            if (firstLetter.size == 1) {
                result += firstLetter.first()
            } else {
                return result
            }

        }
        return result
    }
}
