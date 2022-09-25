package com.leetcode.random_problems.easy.isomorphic

fun main() {
    println("Test case 1:")
    println(Solution().isIsomorphic("egg", "add")) // true
    println()

    println("Test case 2:")
    println(Solution().isIsomorphic("foo", "bar")) // false
    println()

    println("Test case 3:")
    println(Solution().isIsomorphic("paper", "title")) // true
    println()

    println("Test case 4:")
    println(Solution().isIsomorphic("bbbaaaba", "aaabbbba")) // false
    println()

}

class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val charMap = mutableMapOf<Char, Char>()

        s.indices.forEach { i ->
            val a = s[i]
            val b = t[i]

            if (a !in charMap) {
                if (b in charMap.values) return false

                charMap[a] = b

            } else if (charMap[a] != b) return false
        }

        return true
    }
}
