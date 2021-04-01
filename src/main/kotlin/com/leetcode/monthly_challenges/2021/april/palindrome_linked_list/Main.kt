package com.leetcode.monthly_challenges.`2021`.april.palindrome_linked_list

fun main() {
    println("Test case 1:")
    val li = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5, null)))))
    println("" + Solution().isPalindrome(li) + "==" + false)
    println()
    println("Test case 2:")
    val li2 = ListNode(1, ListNode(2, ListNode(2, ListNode(1, null))))
    println("" + Solution().isPalindrome(li2) + "==" + true)
    println()
    println("Test case 3:")
    val li3 = ListNode(1, ListNode(2, ListNode(2, null)))
    println("" + Solution().isPalindrome(li3) + "==" + false)
    println()
    println("Test case 4:")
    val li4 = ListNode(1, ListNode(2, null))
    println("" + Solution().isPalindrome(li4) + "==" + false)
    println()
    println("Test case 5:")
    val li5 = ListNode(1, ListNode(0, ListNode(1, null)))
    println("" + Solution().isPalindrome(li5) + "==" + true)
    println()
    println("Test case 6:")
    val li6 = ListNode(1, ListNode(2, ListNode(2, ListNode(2, ListNode(1, null)))))
    println("" + Solution().isPalindrome(li6) + "==" + true)
    println()
}

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        var node = head
        val list = ArrayList<Int>()
        if (head == null) return true
        while (node != null) {
            list.add(node.`val`)
            node = node.next
        }
        for (i in 0..(list.size - 1) / 2) {
            if (list[i] != list[list.size - 1 - i])
                return false
        }
        return true
    }
}

data class ListNode(var `val`: Int, var next: ListNode? = null)
