package com.leetcode.top100LikedQuestions.easy.find_disappeared_numbers_in_array

fun main() {
    println("Test case 1:")
    println(Solution2().findDisappearedNumbers(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)).toList())
    println()
    println("Test case 2:")
    println(Solution2().findDisappearedNumbers(intArrayOf(1, 1)).toList())
    println()

}

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val missingNumbers = mutableSetOf<Int>()
        val numbers = nums.toHashSet()

        for (i in 1..nums.size) {
            if (!numbers.contains(i) && !missingNumbers.contains(i)) {
                missingNumbers.add(i)
            }
        }

        return missingNumbers.toList()
    }
}

class Solution2 {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        return (1..nums.size).toList().minus(nums.toHashSet()).toList()
    }
}
