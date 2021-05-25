package com.leetcode.top100LikedQuestions.easy.move_zeroes

fun main() {
    println("Test case 1:")
    println(Solution().moveZeroes(intArrayOf(0, 1, 0, 3, 12)))
    println()
    println("Test case 2:")
    println(Solution().moveZeroes(intArrayOf(0)))
    println()

}

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        val final = mutableListOf<Int>()
        val zeroes = mutableListOf<Int>()

        nums.forEach { number ->
            if (number == 0) {
                zeroes.add(0)
            } else {
                final.add(number)
            }
        }

        (final + zeroes).forEachIndexed { i, e ->
            nums[i] = e
        }
    }
}
