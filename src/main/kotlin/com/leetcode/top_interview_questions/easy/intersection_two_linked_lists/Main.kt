package com.leetcode.top_interview_questions.easy.intersection_two_linked_lists

fun main() {
    println("Test case 1:")
    val headA = ListNode(4, ListNode(1, ListNode(8, ListNode(4, ListNode(5, null)))))
    val headB = ListNode(5, ListNode(6, ListNode(1, ListNode(8, ListNode(4, ListNode(5, null))))))
    println(Solution().getIntersectionNode(headA, headB))
    println()

    println("Test case 2:")
    val headA2 = ListNode(2, ListNode(6, ListNode(4, ListNode(4, ListNode(5, null)))))
    val headB2 = ListNode(1, ListNode(9, ListNode(8, ListNode(8, ListNode(7, ListNode(9, null))))))
    println(Solution().getIntersectionNode(headA2, headB2))
    println()

}

class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        val set = mutableSetOf<ListNode?>()
        var pointer = headA
        while (pointer != null && set.add(pointer)) pointer = pointer.next
        pointer = headB
        while (pointer != null && set.add(pointer)) pointer = pointer.next
        return pointer
    }
}

data class ListNode(var `val`: Int, var next: ListNode? = null)
