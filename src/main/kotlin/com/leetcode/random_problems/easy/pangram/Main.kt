package com.leetcode.random_problems.easy.pangram

fun main() {
    println("Test case 1:")
    println(Solution().checkIfPangram("thequickbrownfoxjumpsoverthelazydog")) // true
    println()

    println("Test case 2:")
    println(Solution().checkIfPangram("leetcode")) // false
    println()

}

class Solution {
    val letters = ('a'..'z').toSet()
    fun checkIfPangram(sentence: String): Boolean {
        val alphabet = letters.associateWith { 0 }.toMutableMap()

        sentence.toCharArray().forEach { alphabet[it] = 1 }
        return alphabet.all { it.value > 0 }
    }
}
