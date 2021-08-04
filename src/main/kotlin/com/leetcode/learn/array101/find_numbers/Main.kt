package com.leetcode.learn.array101.find_numbers

fun main() {
    println("Test case 1:")
    println(Solution().findNumbers(intArrayOf(12, 345, 2, 6, 7896))) // 2
    println()

    println("Test case 2:")
    println(Solution().findNumbers(intArrayOf(555, 901, 482, 1771))) // 1
    println()

}

class Solution {
    fun findNumbers(nums: IntArray): Int {
        return nums.filter { num -> num.toString().length % 2 == 0 }.size
    }
}
