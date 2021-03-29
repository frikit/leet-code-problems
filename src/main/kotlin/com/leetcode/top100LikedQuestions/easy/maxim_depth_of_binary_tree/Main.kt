package com.leetcode.top100LikedQuestions.easy.maxim_depth_of_binary_tree


fun main() {
    println("Test case 1:")
    val t1 = TreeNode(1)

    run {
        val leftFirstLeaf = TreeNode(3)
        val rightFirstLeaf = TreeNode(2)

        val leftSecondLeaf = TreeNode(5)
        val rightSecondLeaf = null

        //set nodes
        t1.left = leftFirstLeaf
        t1.right = rightFirstLeaf

        leftFirstLeaf.left = leftSecondLeaf
        leftFirstLeaf.right = rightSecondLeaf
    }

    println(Solution().maxDepth(t1))
    println()

    println("Test case 2:")
    println(Solution().maxDepth(null))
    println()
}

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun maxDepth(root: TreeNode?, currentDepth: Int = 1): Int {
        if (root == null) return 0
        if (root.left == null && root.right == null) return currentDepth

        val leftSide = if (root.left != null) maxDepth(root.left, currentDepth + 1) else 0
        val rightSide = if (root.right != null) maxDepth(root.right, currentDepth + 1) else 0

        return Math.max(leftSide, rightSide)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
