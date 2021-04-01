package com.leetcode.monthly_challenges.april.week2.diameter_of_binary_tree

/**
 * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
1
/ \
2   3
/ \
4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 */
fun main() {
    println("Test case 1:")
    println(Solution().diameterOfBinaryTree(null).toString() + " == " + 0)
    println()

    println("Test case 2:")
    println(Solution().diameterOfBinaryTree(TreeNode(1)).toString() + " == " + 0)
    println()

    println("Test case 3:")
    val root = TreeNode(1)

    val leftFirstLeaf = TreeNode(2)
    val rightFirstLeaf = TreeNode(3)

    val leftSecondLeaf = TreeNode(4)
    val rightSecondLeaf = TreeNode(5)

    //set nodes
    root.left = leftFirstLeaf
    root.right = rightFirstLeaf

    leftFirstLeaf.left = leftSecondLeaf
    leftFirstLeaf.right = rightSecondLeaf

    println(Solution().diameterOfBinaryTree(root).toString() + " == " + 3)
    println()

    println("Test case 4:")
    val leftThirdLeaf = TreeNode(4)
    val rightThirdLeaf = TreeNode(5)

    //set nodes
    leftSecondLeaf.left = leftThirdLeaf
    rightSecondLeaf.left = rightThirdLeaf

    println(Solution().diameterOfBinaryTree(root).toString() + " == " + 4)
    println()

    println("Test case 5:")
    val root2 = TreeNode(1)

    //set nodes
    root2.left = leftThirdLeaf

    println(Solution().diameterOfBinaryTree(root2).toString() + " == " + 1)
    println()

    println("Test case 6:")

    //set nodes
    root2.left = leftThirdLeaf
    leftThirdLeaf.left = TreeNode(9)

    println(Solution().diameterOfBinaryTree(root2).toString() + " == " + 2)
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
    var diameter = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        if (root == null || (root.left == null && root.right == null)) return 0

        maxHeight(root)
        return diameter
    }

    private fun maxHeight(root: TreeNode?): Int {
        if (root == null) return 0

        val left = maxHeight(root.left)
        val right = maxHeight(root.right)

        diameter = Math.max(left + right, diameter)

        return Math.max(left, right) + 1
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
