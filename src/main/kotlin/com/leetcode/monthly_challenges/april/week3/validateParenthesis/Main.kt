package com.leetcode.monthly_challenges.april.week3.validateParenthesis

fun main() {
    println("Test case 1:")
    println(Solution().checkValidString("").toString() + " == " + true)
    println()

    println("Test case 2:")
    println(Solution().checkValidString("()").toString() + " == " + true)
    println()

    println("Test case 3:")
    println(Solution().checkValidString("(*)").toString() + " == " + true)
    println()

    println("Test case 4:")
    println(Solution().checkValidString("*)").toString() + " == " + true)
    println()

    println("Test case 5:")
    println(Solution().checkValidString("(*").toString() + " == " + true)
    println()

    println("Test case 6:")
    println(Solution().checkValidString("(**)))").toString() + " == " + true)
    println()

    println("Test case 7:")
    println(Solution().checkValidString("(*))").toString() + " == " + true)
    println()

    println("Test case 8:")
    println(Solution().checkValidString("(*))((").toString() + " == " + false)
    println()

    println("Test case 9:")
    println(Solution().checkValidString(")").toString() + " == " + false)
    println()

    println("Test case 10:")
    println(
        Solution().checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*").toString() + " == " + false
    )
    println()

    println("Test case 11:")
    println(Solution().checkValidString("(((******))").toString() + " == " + true)
    println()
}

class Solution {
    fun checkValidString(s: String): Boolean {
        return check(s, 0, 0)
    }

    private fun check(s: String, start: Int, countElements: Int): Boolean {
        var count = countElements
        if (count < 0) return false
        for (i in start until s.length) {
            when (s[i]) {
                '(' -> {
                    count++
                }
                ')' -> {
                    if (count <= 0) return false
                    count--
                }
                '*' -> {
                    return check(s, i + 1, count + 1) || check(s, i + 1, count - 1) || check(s, i + 1, count)
                }
            }
        }
        return count == 0
    }
}
