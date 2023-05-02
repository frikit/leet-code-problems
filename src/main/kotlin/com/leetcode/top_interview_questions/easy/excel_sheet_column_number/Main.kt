package com.leetcode.top_interview_questions.easy.excel_sheet_column_number

fun main() {
    println("Test case 1:")
    println(Solution().titleToNumber("A")) // 1
    println()

    println("Test case 2:")
    println(Solution().titleToNumber("AB")) // 28
    println()

    println("Test case 3:")
    println(Solution().titleToNumber("ZY")) // 701
    println()
}

class Solution {
    fun titleToNumber(columnTitle: String): Int {
        return columnTitle.toCharArray()
            .map { it - 'A' + 1 }
            .reduce { acc, i -> acc * 26 + i }
    }
}
