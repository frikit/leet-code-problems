package com.leetcode.monthly_challenges.`2021`.april.strings_alike

fun main() {
    println("Test case 1:")
    println(Solution().halvesAreAlike("book"))//true
    println()
    println("Test case 2:")
    println(Solution().halvesAreAlike("textbook"))//false
    println()
    println("Test case 3:")
    println(Solution().halvesAreAlike("MerryChristmas"))//false
    println()
    println("Test case 4:")
    println(Solution().halvesAreAlike("AbCdEfGh"))//true
    println()
}

class Solution {
    val vowels = hashSetOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

    fun isVowel(char: Char): Boolean = vowels.contains(char)

    fun halvesAreAlike(s: String): Boolean {
        val leftVowels = s.substring(0, s.length / 2).count { isVowel(it) }
        val rightVowels = s.substring(s.length / 2).count { isVowel(it) }

        return leftVowels == rightVowels
    }
}
