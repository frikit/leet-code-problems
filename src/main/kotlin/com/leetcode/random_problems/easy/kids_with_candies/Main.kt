package com.leetcode.random_problems.easy.kids_with_candies

fun main() {
    println("Test case 1:")
    println(Solution().kidsWithCandies(listOf(2, 3, 5, 1, 3).toIntArray(), 3).toList()) // [true,true,true,false,true]
    println()

    println("Test case 2:")
    println(
        Solution().kidsWithCandies(listOf(4, 2, 1, 1, 2).toIntArray(), 1).toList()
    ) // [true,false,false,false,false]
    println()

}

class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val max = candies.max()
        return candies.map { c -> c + extraCandies >= max }
    }
}
