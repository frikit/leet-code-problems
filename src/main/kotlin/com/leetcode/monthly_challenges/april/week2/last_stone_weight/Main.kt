package com.leetcode.monthly_challenges.april.week2.last_stone_weight

/**
 * We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)



Example 1:

Input: [2,7,4,1,8,1]
Output: 1
Explanation:
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.


Note:

1 <= stones.length <= 30
1 <= stones[i] <= 1000
 */
fun main() {
    println("Test case 1:")
    println(Solution().lastStoneWeight(intArrayOf(2, 7, 4, 1, 8, 1)).toString() + " == " + 1)
    println("Test case 1:")
    println(Solution().lastStoneWeight(intArrayOf(1, 1)).toString() + " == " + 0)
}

class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val stonesList = stones.sorted().reversed().toMutableList()

        while (stonesList.isNotEmpty()) {
            if (stonesList.size == 1) return stonesList.first()

            val first = stonesList.getOrElse(0) { 0 }
            val second = stonesList.getOrElse(1) { 0 }

            if (first - second == 0) {
                stonesList.removeAt(1)
                stonesList.removeAt(0)
            } else {
                val diff = first - second

                stonesList.removeAt(1)
                stonesList.removeAt(0)

                stonesList.add(diff)

                stonesList.sort()
                stonesList.reverse()
            }
        }

        return 0
    }
}
