package com.leetcode.top100LikedQuestions.easy.binary_tree_inorder_traversal


fun main() {
    println("Test case 1:")
    val t1 = TreeNode(1)
    t1.left = null
    t1.right = TreeNode(2)
    t1.right!!.left = TreeNode(3)
    println(Solution().inorderTraversal(t1))

    println("Test case 2:")
    val t2 = null
    println(Solution().inorderTraversal(t2))

    println("Test case 3:")
    val t3 = TreeNode(1)
    println(Solution().inorderTraversal(t3))

    println("Test case 4:")
    val t4 = TreeNode(1)
    t4.left = TreeNode(2)
    println(Solution().inorderTraversal(t4))

    println("Test case 5:")
    val t5 = TreeNode(1)
    t5.left = null
    t5.right = TreeNode(2)
    println(Solution().inorderTraversal(t5))

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
    fun inorderTraversal(root: TreeNode?, acc: MutableList<Int> = mutableListOf()): List<Int> {
        if (root != null) {
            inorderTraversal(root.left, acc)
            acc.add(root.`val`)
            inorderTraversal(root.right, acc)
        }

        return acc
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
