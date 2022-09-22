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
    fun checkIfPangram(sentence: String): Boolean {
        val hashSet = mutableSetOf<Char>()
        sentence.toCharArray().forEach { if (!hashSet.contains(it)) hashSet.add(it) }
        return hashSet.size == 26
    }
}
