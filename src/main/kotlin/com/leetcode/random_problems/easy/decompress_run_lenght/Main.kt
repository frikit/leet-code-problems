package com.leetcode.random_problems.easy.decompress_run_lenght

fun main() {
    println("Test case 1:")
    println(Solution().decompressRLElist(intArrayOf(1, 2, 3, 4)).toList()) // 2,4,4,4
    println()

    println("Test case 2:")
    println(Solution().decompressRLElist(intArrayOf(1, 1, 2, 3)).toList()) // 1,3,3
    println()
}

class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()

        var currIndex = 0
        while (currIndex < nums.size - 1) {
            val freq = nums[currIndex]
            currIndex++
            val value = nums[currIndex]
            currIndex++

            repeat(freq) {
                result.add(value)
            }
        }

        return result.toIntArray()
    }
}
