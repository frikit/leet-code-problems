package com.leetcode.top100LikedQuestions.easy.reverse_linked_list

fun main() {
    println("Test case 1:")
    val li = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, null)))))
    println(Solution().reverseList(li))
    println()

}

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        return reverseList(null, head)
    }

    fun reverseList(prev: ListNode?, node: ListNode?): ListNode? {
        if (node == null) {
            return prev
        }
        val aux = node.next
        node.next = prev
        return reverseList(node, aux)
    }
}

data class ListNode(var `val`: Int, var next: ListNode? = null)
