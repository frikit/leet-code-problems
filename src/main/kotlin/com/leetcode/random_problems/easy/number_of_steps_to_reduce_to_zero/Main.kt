package com.leetcode.random_problems.easy.number_of_steps_to_reduce_to_zero

fun main() {
    println("Test case 1:")
    println(Solution().numberOfSteps(14)) // 6
    println()

    println("Test case 2:")
    println(Solution().numberOfSteps(8)) // 4
    println()

    println("Test case 3:")
    println(Solution().numberOfSteps(123)) // 12
    println()
}

class Solution {
    fun numberOfSteps(num: Int): Int {
        var steps = 0
        var res = num

        while (res != 0) {
            if (res % 2 == 0) {
                res = res / 2
            } else {
                res = res - 1
            }

            steps++
        }

        return steps
    }
}
