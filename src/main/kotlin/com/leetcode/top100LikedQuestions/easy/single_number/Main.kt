package com.leetcode.top100LikedQuestions.easy.single_number

fun main() {
    println("Test case 1:")
    println(Solution().singleNumber(intArrayOf(2, 2, 1)))
    println()

}
class Solution {
    fun singleNumber(nums: IntArray): Int {
        if (nums.size == 1) return nums.first()

        val hashMap = mutableMapOf<Int, Int>()
        for (num in nums) {
            if (hashMap.containsKey(num)) {
                hashMap[num] = 2
            } else if (!hashMap.containsKey(num)) {
                hashMap[num] = 1
            }
        }

        return hashMap.entries.find { it.value == 1 }?.key!!
    }
}
