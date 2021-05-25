package com.leetcode.top100LikedQuestions.easy.symetric_binary_tree


fun main() {
    println("Test case 1:")
    val t1 = TreeNode(1)
    t1.left = TreeNode(2)
    t1.right = TreeNode(2)

    t1.left!!.left = TreeNode(3)
    t1.left!!.right = TreeNode(4)

    t1.right!!.left = TreeNode(4)
    t1.right!!.right = TreeNode(3)
    println(Solution().isSymmetric(t1))

    println("Test case 2:")
    val t2 = TreeNode(1)
    t2.left = TreeNode(2)
    t2.right = TreeNode(2)

    t2.left!!.right = TreeNode(3)

    t2.right!!.right = TreeNode(3)
    println(Solution().isSymmetric(t2))

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
    fun isSymmetric(root: TreeNode?): Boolean {
        return isSymmetric(root?.left, root?.right)
    }

    fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
        if (left != null && right == null) return false
        if (left == null && right != null) return false
        if (left == null && right == null) return true
        if (left?.`val` != null && left.`val` != right?.`val`) {
            return false
        }

        return isSymmetric(left?.left, right?.right) && isSymmetric(left?.right, right?.left)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
