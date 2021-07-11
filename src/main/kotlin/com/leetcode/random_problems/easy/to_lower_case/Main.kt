package com.leetcode.random_problems.easy.to_lower_case

import java.util.*

fun main() {
    println("SOLUTION 1")
    println("Test case 1:")
    println(Solution().toLowerCase("Hello")) // hello
    println()

    println("Test case 2:")
    println(Solution().toLowerCase("here")) // here
    println()

    println("Test case 3:")
    println(Solution().toLowerCase("LOVELY")) // lovely
    println()

    println("Test case 4:")
    println(Solution().toLowerCase("al&phaBET")) // al&phabet
    println()

    println("SOLUTION 1")
    println("Test case 1:")
    println(Solution2().toLowerCase("Hello")) // hello
    println()

    println("Test case 2:")
    println(Solution2().toLowerCase("here")) // here
    println()

    println("Test case 3:")
    println(Solution2().toLowerCase("LOVELY")) // lovely
    println()

    println("Test case 4:")
    println(Solution2().toLowerCase("al&phaBET")) // al&phabet
    println()
}

class Solution {
    fun toLowerCase(s: String): String {
        return s.lowercase(Locale.getDefault())
    }
}

class Solution2 {
    private val alphabet = ('A'..'Z').zip('a'..'z').toMap()

    fun toLowerCase(s: String): String {
        return s
            .map { if (alphabet.containsKey(it)) alphabet[it] else it }
            .filterNotNull()
            .joinToString(separator = "")
    }
}
