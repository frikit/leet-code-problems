package com.leetcode.random_problems.easy.max_depth_paranthesis

fun main() {
    println("Test case 1:")
    println(Solution().maxDepth("(1+(2*3)+((8)/4))+1")) // 3
    println()

    println("Test case 2:")
    println(Solution().maxDepth("(1)+((2))+(((3)))")) // 3
    println()

    println("Test case 3:")
    println(Solution().maxDepth("1+(2*3)/(2-1)")) // 1
    println()

}

class Solution {
    fun maxDepth(s: String): Int {
        var depth = 0
        var maxDepth = 0

        s.forEach { c ->
            when {
                c == '(' -> depth++
                c == ')' -> depth--
            }

            maxDepth = maxOf(maxDepth, depth)
        }

        return maxDepth
    }
}
