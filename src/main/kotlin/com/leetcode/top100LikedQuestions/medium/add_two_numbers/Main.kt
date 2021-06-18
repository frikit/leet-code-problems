package com.leetcode.top100LikedQuestions.medium.add_two_numbers

fun main() {
    println("Test case 1:")
    val ll1 = ListNode(2, ListNode(4, ListNode(3, null)))
    val ll2 = ListNode(5, ListNode(6, ListNode(4, null)))
    println(Solution().addTwoNumbers(ll1, ll2)) //[7,0,8]
    println()

    println("Test case 2:")
    val ll12 = ListNode(9, ListNode(9, ListNode(9, null)))
    val ll22 = ListNode(9, ListNode(9, null))
    println(Solution().addTwoNumbers(ll12, ll22)) //[8, 9, 0, 1]
    println()

    println("Test case 3:")
    val ll13 = ListNode(5, null)
    val ll23 = ListNode(5, null)
    println(Solution().addTwoNumbers(ll13, ll23)) //[0, 1]
    println()

}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null || l2 == null) return null

        var newLinkedList: ListNode? = null
        var currL1 = l1
        var currL2 = l2
        var rest = 0
        while (currL1 != null || currL2 != null) {
            val f1 = if (currL1?.`val` == null) 0 else currL1.`val`
            val f2 = if (currL2?.`val` == null) 0 else currL2.`val`
            var sum = f1 + f2
            if (sum > 9) {
                sum = sum - 10 + rest
                rest = 1
            } else {
                if (sum == 10) {
                    sum = 0
                    rest = 1
                } else {
                    sum = sum + rest
                    if (sum > 9) {
                        sum = sum - 10
                        rest = 1
                    } else {
                        rest = 0
                    }
                }
            }


            if (newLinkedList == null) {
                newLinkedList = ListNode(sum, null)

                if (currL1?.next == null && currL2?.next == null && rest != 0) {
                    newLinkedList.next = ListNode(rest, null)
                }

            } else {
                var lastElement = newLinkedList
                while (lastElement?.next != null) {
                    lastElement = lastElement.next
                }
                lastElement?.next = ListNode(sum, null)

                if (currL1?.next == null && currL2?.next == null && rest != 0) {
                    lastElement?.next?.next = ListNode(rest, null)
                }
            }

            currL1 = currL1?.next
            currL2 = currL2?.next
        }

        return newLinkedList
    }
}

data class ListNode(var `val`: Int, var next: ListNode? = null)
