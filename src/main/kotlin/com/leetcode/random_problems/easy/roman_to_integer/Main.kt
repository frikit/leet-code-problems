package com.leetcode.random_problems.easy.roman_to_integer

fun main() {
    println("Test case 1:")
    println(Solution().romanToInt("III")) // 3
    println()

    println("Test case 2:")
    println(Solution().romanToInt("IV")) // 4
    println()

    println("Test case 3:")
    println(Solution().romanToInt("IX")) // 9
    println()

    println("Test case 4:")
    println(Solution().romanToInt("LVIII")) // 58 Explanation: L = 50, V= 5, III = 3.
    println()

    println("Test case 5:")
    println(Solution().romanToInt("MCMXCIV")) // 1994 Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
    println()

}

class Solution {

    val numberMap = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    fun romanToInt(s: String): Int {
        var current: Int
        var previous = -1

        val operations = s.map { c ->
            current = numberMap[c] ?: throw IllegalArgumentException("Map doesnt contain $c")

            when {
                previous == -1 -> {
                    previous = current
                    +current
                }
                previous < current -> {
                    +(current - (previous * 2))
                }
                else -> {
                    previous = current
                    current
                }
            }
        }

        return operations.reduce { acc, i -> acc + i }
    }
}
