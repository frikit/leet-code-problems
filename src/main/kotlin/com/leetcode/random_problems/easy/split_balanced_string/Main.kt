package com.leetcode.random_problems.easy.split_balanced_string

fun main() {
    println("Test case 1:")
//    Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
    println(Solution().balancedStringSplit("RLRRLLRLRL")) // 4
    println()

    println("Test case 2:")
//    Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
    println(Solution().balancedStringSplit("RLLLLRRRLR")) // 3
    println()

    println("Test case 3:")
//    Explanation: s can be split into "LLLLRRRR".
    println(Solution().balancedStringSplit("LLLLRRRR")) // 1
    println()

    println("Test case 4:")
//    Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
    println(Solution().balancedStringSplit("RLRRRLLRLL")) // 2
    println()

}

class Solution {
    fun balancedStringSplit(s: String): Int {
        var balanced = 0
        var currentWeight = 0

        s.forEach { c ->
            when {
                c == 'R' -> currentWeight--
                c == 'L' -> currentWeight++
            }

            if (currentWeight == 0) balanced++
        }

        return balanced
    }
}
