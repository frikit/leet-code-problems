package com.leetcode.top100LikedQuestions.medium.longest_uniq_substring

fun main() {
    println("Test case 1:")
    println(Solution().lengthOfLongestSubstring("abcabcbb"))
    println()
    println("Test case 2:")
    println(Solution().lengthOfLongestSubstring("bbbbb"))
    println()
    println("Test case 3:")
    println(Solution().lengthOfLongestSubstring("pwwkew"))
    println()
    println("Test case 4:")
    println(Solution().lengthOfLongestSubstring(""))
    println()
    println("Test case 5:")
    println(Solution().lengthOfLongestSubstring("   "))
    println()
    println("Test case 6:")
    println(Solution().lengthOfLongestSubstring("dvdf"))
    println()

}

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        if (s.isEmpty()) return 0
        if (s.isBlank()) return 1
        var max = Integer.MIN_VALUE
        val tried = mutableSetOf<Char>()
        var curr = ""

        s.forEach { char ->
            if (!tried.contains(char)) {
                tried.add(char)
                curr += char
            } else {
                val from = curr.lastIndexOf(char)

                curr = curr.substring(from + 1) + char

                tried.remove(char)
                tried.add(char)
            }

            max = Math.max(curr.length, max)
        }

        return max
    }
}
