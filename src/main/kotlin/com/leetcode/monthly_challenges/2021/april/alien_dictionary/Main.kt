package com.leetcode.monthly_challenges.`2021`.april.alien_dictionary

fun main() {
    println("Test case 1:")
    println(Solution().isAlienSorted(arrayOf("hello", "leetcode"), "hlabcdefgijkmnopqrstuvwxyz"))//true
    println()
    println("Test case 2:")
    println(Solution().isAlienSorted(arrayOf("word", "world", "row"), "worldabcefghijkmnpqstuvxyz"))//false
    println()
    println("Test case 3:")
    println(Solution().isAlienSorted(arrayOf("apple", "app"), "abcdefghijklmnopqrstuvwxyz"))//false
    println()
}

//class Solution {
//    fun isAlienSorted(words: Array<String>, order: String): Boolean {
//        val dictionary = order.toCharArray().mapIndexed { index, c -> c to index }.toMap()
//
//        for (word in words) {
//            var lastMaxIndex = -1
//            for (char in word.toCharArray()) {
//                val currIdx = dictionary[char] ?: return false
//                if (currIdx >= lastMaxIndex) {
//                    lastMaxIndex = currIdx
//                } else {
//                    return false
//                }
//            }
//        }
//
//        return true
//    }
//}

class Solution {
    var mapping = IntArray(26)
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        for (i in order.indices) mapping[order[i] - 'a'] = i
        for (i in 1 until words.size) if (bigger(words[i - 1], words[i])) return false
        return true
    }

    fun bigger(s1: String, s2: String): Boolean {
        val n = s1.length
        val m = s2.length
        var i = 0
        while (i < n && i < m) {
            if (s1[i] != s2[i]) return mapping[s1[i] - 'a'] > mapping[s2[i] - 'a']
            ++i
        }
        return n > m
    }
}
