package com.leetcode.top100LikedQuestions.easy.mergind_two_binaries_tree

/**
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:

Input:
Tree 1                     Tree 2
1                         2
/ \                       / \
3   2                     1   3
/                           \   \
5                             4   7
Output:
Merged tree:
3
/ \
4   5
/ \   \
5   4   7



Note: The merging process must start from the root nodes of both trees.

 */
fun main() {
    println("Test case 1:")
    //t1
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

    //t2
    val t2 = TreeNode(2)

    run {
        val leftFirstLeaf = TreeNode(1)
        val rightFirstLeaf = TreeNode(3)

        val leftSecondLeaf = null
        val rightSecondLeaf = TreeNode(4)

        val leftSecondLeaf2 = null
        val rightSecondLeaf2 = TreeNode(7)

        //set nodes
        t1.left = leftFirstLeaf
        t1.right = rightFirstLeaf

        leftFirstLeaf.left = leftSecondLeaf
        leftFirstLeaf.right = rightSecondLeaf

        rightFirstLeaf.left = leftSecondLeaf2
        rightFirstLeaf.right = rightSecondLeaf2
    }

    println(Solution().mergeTrees(t1, t2))

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
    fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
        if (t1 == null) return t2
        if (t2 == null) return t1

        t1.`val` += t2.`val`

        t1.left = mergeTrees(t1.left, t2.left)
        t1.right = mergeTrees(t1.right, t2.right)

        return t1
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
