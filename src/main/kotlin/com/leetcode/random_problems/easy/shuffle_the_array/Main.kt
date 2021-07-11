package com.leetcode.random_problems.easy.shuffle_the_array

fun main() {
    println("Test case 1:")
    println(Solution().shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3).toList()) // 2,3,5,4,1,7
    println()

    println("Test case 2:")
    println(Solution().shuffle(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4).toList()) // 1,4,2,3,3,2,4,1
    println()

    println("Test case 3:")
    println(Solution().shuffle(intArrayOf(1, 1, 2, 2), 2).toList()) // 1,2,1,2
    println()

}

class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        if (n <= 1) return nums

        val shuffled = IntArray(nums.size)
        var secondIdx = n
        var currentInsertIndex = 0

        nums.take(n).forEach { firstArrayNumber ->
            val secondArrayNumber = nums[secondIdx]

            shuffled[currentInsertIndex] = firstArrayNumber
            currentInsertIndex++
            shuffled[currentInsertIndex] = secondArrayNumber
            currentInsertIndex++

            secondIdx++
        }

        return shuffled
    }
}
