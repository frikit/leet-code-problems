package com.leetcode.top100LikedQuestions.easy.valid_parantheses

import java.util.*

fun main() {
    println("Test case 1:")
    println("" + Solution().isValid("()") + "==" + true)
    println()
    println("Test case 2:")
    println("" + Solution().isValid("()[]{}") + "==" + true)
    println()
    println("Test case 3:")
    println("" + Solution().isValid("(]") + "==" + false)
    println()
    println("Test case 4:")
    println("" + Solution().isValid("([)]") + "==" + false)
    println()
    println("Test case 5:")
    println("" + Solution().isValid("{[]}") + "==" + true)
    println()
    println("Test case 6:")
    println("" + Solution().isValid("(([]){})") + "==" + true)
    println()

}

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        s.reversed().forEach {
            when (it) {
                '(' -> if (stack.isNotEmpty() && stack.peek() == ')') stack.pop() else stack.push(it)
                '[' -> if (stack.isNotEmpty() && stack.peek() == ']') stack.pop() else stack.push(it)
                '{' -> if (stack.isNotEmpty() && stack.peek() == '}') stack.pop() else stack.push(it)
                else -> stack.push(it)
            }
        }

        return stack.isEmpty()
    }
}
