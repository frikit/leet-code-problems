package com.leetcode.random_problems.easy.substract_product_and_sum

fun main() {
    println("SOLUTION 1")
    println("Test case 1:")
    println(Solution().subtractProductAndSum(234)) // 15
    println()

    println("Test case 2:")
    println(Solution().subtractProductAndSum(4421)) // 21
    println()

    println("SOLUTION 2")
    println("Test case 1:")
    println(Solution2().subtractProductAndSum(234)) // 15
    println()

    println("Test case 2:")
    println(Solution2().subtractProductAndSum(4421)) // 21
    println()
}

class Solution {
    fun subtractProductAndSum(n: Int): Int {
        val numbers = n.toString().toCharArray().map { it.toString().toInt() }

        var product = 1
        var sum = 0
        numbers.forEach { num ->
            product *= num
            sum += num
        }

        return product - sum
    }
}

class Solution2 {
    fun subtractProductAndSum(n: Int): Int {
        val numbers = n.toString().toCharArray().map { it.toString().toInt() }

        val product = numbers.reduce { acc, i -> acc * i }
        val sum = numbers.sum()

        return product - sum
    }
}
