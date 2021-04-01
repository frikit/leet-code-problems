package com.leetcode.monthly_challenges.april.week2.backspace_compare

fun main() {
    println("Test case 1:")
    println(Solution().backspaceCompare("c", "c"))
    println()

    println("Test case 2:")
    println(Solution().backspaceCompare("c#c", "c"))
    println()

    println("Test case 3:")
    println(Solution().backspaceCompare("#c", "c"))
    println()

    println("Test case 4:")
    println(Solution().backspaceCompare("cc", "c#c##cc"))
    println()

    println("Test case 5:")
    println(Solution().backspaceCompare("#c#", ""))
    println()

    println("Test case 6:")
    println(Solution().backspaceCompare("##c", "c"))
    println()

    println("Test case 7:")
    println(Solution().backspaceCompare("##c##", ""))
    println()

    //site TC
    println("Test case 9:")
    println(Solution().backspaceCompare("ab#c", "ad#c"))
    println()

    println("Test case 99:")
    println(Solution().backspaceCompare("ab##", "a#d#"))
    println()

    println("Test case 999:")
    println(Solution().backspaceCompare("a##c", "#a#c"))
    println()

    println("Test case 9999:")
    println(Solution().backspaceCompare("a#c", "b"))
    println()

    println("Test case 99999:")
    println(Solution().backspaceCompare("xywrrmp", "xywrrmu#p"))
    println()

}

class Solution {
    fun backspaceCompare(first: String, second: String): Boolean {
        val processedFirst = processBackspaces(first, first.count { it == '#' })
        val processedSecond = processBackspaces(second, second.count { it == '#' })

        return processedFirst == processedSecond
    }

    private fun processBackspaces(input: String, counter: Int): String {
        println(input)
        //no hash in string
        if (counter == 0) return input

        val result = mutableListOf<Char>()

        val chars = input.toCharArray()
        for (char in chars) {
            if (char == '#') {
                if (result.size > 0) {
                    result.removeAt(result.size - 1)
                }
            } else {
                result.add(char)
            }
        }

        return result.joinToString("")
    }
}
