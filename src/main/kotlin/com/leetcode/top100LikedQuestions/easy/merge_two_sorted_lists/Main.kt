package com.leetcode.top100LikedQuestions.easy.merge_two_sorted_lists

fun main() {
    println("Test case 1:")
    //l1
    val l1ll = ListNode(4)
    val l1lf = ListNode(2)
    val l1 = ListNode(1)
    l1.next = l1lf
    l1lf.next = l1ll
    //l2
    val l2ll = ListNode(4)
    val l2lf = ListNode(3)
    val l2 = ListNode(1)
    l2.next = l2lf
    l2lf.next = l2ll
    println(Solution().mergeTwoLists(l1, l2))
    println()

}

class Solution {

    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        if (l2 == null) return l1
        if (l1.`val` < l2.`val`) {
            l1.next = mergeTwoLists(l1.next, l2)
            return l1
        } else {
            l2.next = mergeTwoLists(l1, l2.next)
            return l2
        }
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return "ListNode(`val`=$`val`, next=$next)"
    }
}
