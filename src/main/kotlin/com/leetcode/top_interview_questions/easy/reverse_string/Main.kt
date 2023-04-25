package com.leetcode.top_interview_questions.easy.reverse_string

fun main() {
    println("Test case 1:")
    val arr1 = charArrayOf('h', 'e', 'l', 'l', 'o')
    println(Solution().reverseString(arr1)) // ["o","l","l","e","h"]
    println(arr1.contentToString())
    println()

    println("Test case 2:")
    val arr2 = charArrayOf('H', 'a', 'n', 'n', 'a', 'h')
    println(Solution().reverseString(arr2)) // ["h","a","n","n","a","H"]
    println(arr2.contentToString())
    println()
}

class Solution {
    fun reverseString(s: CharArray) {
        val indexes = s.indices.toList()
        repeat (indexes.size / 2) {idx ->
            val first = s[idx]
            val lastIdx = indexes.size - 1 - idx
            val last = s[lastIdx]
            s[lastIdx] = first
            s[idx] = last
        }
    }
}
