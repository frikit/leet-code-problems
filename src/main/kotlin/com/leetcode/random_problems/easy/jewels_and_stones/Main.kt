package com.leetcode.random_problems.easy.jewels_and_stones

fun main() {
    println("Test case 1:")
    println(Solution().numJewelsInStones("aA", "aAAbbbb")) // 3
    println()

    println("Test case 2:")
    println(Solution().numJewelsInStones("z", "ZZ")) // 0
    println()

}

class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        val jews = jewels.toCharArray().toSet()
        return stones.count { jews.contains(it) }
    }
}
