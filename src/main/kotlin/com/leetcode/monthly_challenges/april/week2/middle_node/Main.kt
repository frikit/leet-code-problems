package com.leetcode.monthly_challenges.april.week2.middle_node

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.

If there are two middle nodes, return the second middle node.



Example 1:

Input: [1,2,3,4,5]
Output: Node 3 from this list (Serialization: [3,4,5])
The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
Note that we returned a ListNode object ans, such that:
ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
Example 2:

Input: [1,2,3,4,5,6]
Output: Node 4 from this list (Serialization: [4,5,6])
Since the list has two middle nodes with values 3 and 4, we return the second one.


Note:

The number of nodes in the given list will be between 1 and 100.
 */
fun main() {
    val head = ListNode(1)
    val second = ListNode(2)
    val third = ListNode(3)
    val forth = ListNode(4)
    val fifth = ListNode(5)
    val last = ListNode(6)

    head.next = second
    second.next = third
    third.next = forth
    forth.next = fifth
    fifth.next = last
    last.next = null

    println("Test case 1:")
    println(Solution().middleNode(null))
    println("Test case 2:")
    println(Solution().middleNode(last))
    println("Test case 3:")
    //should be 4
    println(Solution().middleNode(head))
    println("Test case 4:")
    fifth.next = null
    //should be 3
    println(Solution().middleNode(head))
}


/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return `val`.toString()
    }
}

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        if (head == null) return head

        val asList = convertAsList(head)
        val size = asList.size
        val mid = size / 2

        return asList[mid]
    }

    private fun convertAsList(head: ListNode?): List<ListNode> {
        val result = mutableListOf<ListNode>()

        var next = head
        while (next != null) {
            result.add(next)
            next = next.next
        }

        return result
    }
}
