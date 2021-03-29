package com.leetcode.top100LikedQuestions.easy.two_sum

fun main() {
    println("Test case 1:")
    println(Solution().twoSum(intArrayOf(2, 7, 11, 15), 9).toList())
    println()
    println("Test case 2:")
    println(Solution().twoSum(intArrayOf(3, 2, 4), 6).toList())
    println()
    println("Test case 3:")
    println(Solution().twoSum(intArrayOf(3, 3), 6).toList())
    println()

}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        if (nums.size == 2) return intArrayOf(0, 1)

        nums.forEachIndexed { i, num ->
            nums.forEachIndexed { j, num2 ->
                if (i != j && num + num2 == target) return intArrayOf(i, j)
            }
        }

        return intArrayOf(0)
    }
}
