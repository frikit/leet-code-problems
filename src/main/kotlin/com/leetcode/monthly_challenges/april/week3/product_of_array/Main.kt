package com.leetcode.monthly_challenges.april.week3.product_of_array

fun main() {
    println("Test case 1:")
    println(
        Solution().productExceptSelf(intArrayOf(1, 2, 3, 4)).map { it }.toList() + " == " + intArrayOf(
            24,
            12,
            8,
            6
        ).map { it }.toList()
    )
    println()
}

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        nums.indices.forEach { index ->
            var element = 1
            nums.forEachIndexed { index2, j ->
                if (index != index2) {
                    element *= j
                }
            }

            result[index] = element
        }

        return result
    }
}

