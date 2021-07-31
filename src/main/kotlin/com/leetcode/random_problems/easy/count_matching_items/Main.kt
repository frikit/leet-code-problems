package com.leetcode.random_problems.easy.count_matching_items

fun main() {
    println("Test case 1:")
    val elements1 = listOf(
        listOf("phone", "blue", "pixel"),
        listOf("computer", "silver", "lenovo"),
        listOf("phone", "gold", "iphone")
    )
    println(Solution().countMatches(elements1, "color", "silver")) // 1
    println()

    println("Test case 2:")
    val elements2 = listOf(
        listOf("phone", "blue", "pixel"),
        listOf("computer", "silver", "phone"),
        listOf("phone", "gold", "iphone")
    )
    println(Solution().countMatches(elements2, "type", "phone")) // 2
    println()
}

class Solution {
    val rules = mapOf("type" to 0, "color" to 1, "name" to 2)
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        val ruleIndex = rules[ruleKey] ?: throw IllegalArgumentException("No such rule key")

        return items.count { item -> item[ruleIndex] == ruleValue }
    }
}
