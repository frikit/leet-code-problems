package com.leetcode.random_problems.easy.middle_of_linked_list

fun main() {
    println("Test case 1:")
    val li = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, null)))))
    println(Solution().middleNode(li)) // [3,4,5]
    println()

    println("Test case 2:")
    val li2 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, ListNode(6, null))))))
    println(Solution().middleNode(li2)) // [4,5,6]
    println()

}

class Solution {
    private fun count(head: ListNode?): Int {
        var count = 0
        var curr: ListNode? = head
        while (curr != null) {
            count++
            curr = curr.next
        }

        return count
    }

    fun middleNode(head: ListNode?): ListNode? {
        val size = count(head)

        val midIdx = size / 2
        var currIdx = 0
        var curr = head
        while (currIdx != midIdx) {
            curr = curr?.next
            currIdx++
        }


        return curr
    }
}

data class ListNode(var `val`: Int, var next: ListNode? = null)
