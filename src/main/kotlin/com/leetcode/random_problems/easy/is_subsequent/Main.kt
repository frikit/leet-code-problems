package com.leetcode.random_problems.easy.is_subsequent

fun main() {
    println("Test case 1:")
    println(Solution().isSubsequence("abc", "ahbgdc")) // true
    println()

    println("Test case 2:")
    println(Solution().isSubsequence("axc", "ahbgdc")) // false
    println()

    println("Test case 3:")
    println(Solution().isSubsequence("acb", "ahbgdc")) // false
    println()

}

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        return s.toCharArray().all { c ->
            t.drop(i).forEach { c2 ->
                if (c == c2) {
                    i++
                    return@all true
                }

                i++
            }

            false
        }
    }
}
