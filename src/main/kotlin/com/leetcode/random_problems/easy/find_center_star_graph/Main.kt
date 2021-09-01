package com.leetcode.random_problems.easy.find_center_star_graph

fun main() {
    println("Test case 1:")
    println(Solution().findCenter(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(4, 2)))) // 2
    println()

    println("Test case 2:")
    println(Solution().findCenter(arrayOf(intArrayOf(1, 2), intArrayOf(5, 1), intArrayOf(1, 3), intArrayOf(1, 4)))) // 1
    println()

}

class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        var common = 0
        val firstNode = edges.first()

        edges.drop(1).forEach { node ->
            if (common == 0) {
                val first = firstNode.get(0)
                val second = firstNode.get(1)

                if (node.contains(first)) {
                    common = first
                } else if (node.contains(second)) {
                    common = second
                }
            } else {
                if (!node.contains(common)) {
                    throw RuntimeException("No common element")
                }
            }
        }

        return common
    }
}
