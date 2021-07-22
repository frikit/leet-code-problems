package com.leetcode.random_problems.easy.goal_parser_interpretation

fun main() {
    println("Test case 1:")
    println(Solution().interpret("G()(al)")) // Goal
    println()

    println("Test case 2:")
    println(Solution().interpret("G()()()()(al)")) // Gooooal
    println()

    println("Test case 3:")
    println(Solution().interpret("(al)G(al)()()G")) // alGalooG
    println()

}

class Solution {
    private val dictionary = mapOf("G" to "G", "()" to "o", "(al)" to "al")
    fun interpret(command: String): String {
        var result = ""
        var isDone = false

        var remain = command
        while (!isDone) {
            if (remain.isEmpty()) {
                isDone = true
            } else {
                val firstToken = when {
                    remain.substring(0, 1) == "G" -> "G"
                    remain.substring(0, 2) == "()" -> "()"
                    remain.substring(0, 4) == "(al)" -> "(al)"
                    else -> throw IllegalArgumentException("Can't find token")
                }
                val value = dictionary.getOrDefault(firstToken, "")
                remain = remain.substring(firstToken.length)
                result += value
            }
        }
        return result
    }
}
