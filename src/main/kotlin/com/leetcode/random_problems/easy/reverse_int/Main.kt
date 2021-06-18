package com.leetcode.random_problems.easy.reverse_int

fun main() {
    println("Test case 1:")
    println(Solution().reverse(123)) // 321
    println()

    println("Test case 2:")
    println(Solution().reverse(-123)) //-321
    println()

    println("Test case 3:")
    println(Solution().reverse(120)) // 21
    println()

    println("Test case 4:")
    println(Solution().reverse(0)) // 0
    println()

}

class Solution {
    fun reverse(x: Int): Int {
        if (x == 0) return 0

        val isMinus = x < 0
        val asString = if (isMinus) x.toString().substring(1) else x.toString()

        var reversed = asString.reversed()
        while (reversed.startsWith("0")) {
            reversed = reversed.substring(1)
        }

        return try {
            if (isMinus) {
                -reversed.toInt()
            } else {
                reversed.toInt()
            }
        } catch (exp: Exception) {
            0
        }
    }
}
