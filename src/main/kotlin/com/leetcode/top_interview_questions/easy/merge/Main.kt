package com.leetcode.top_interview_questions.easy.merge

fun main() {
    println("Test case 1:")
    val arr1 = intArrayOf(1, 2, 3, 0, 0, 0)
    val arr2 = intArrayOf(2, 5, 6)
    println(Solution().merge(arr1, 3, arr2, 3)) // [1,2,2,3,5,6]
    println(arr1.toList())
    println()

    println("Test case 2:")
    val arr3 = intArrayOf(1)
    val arr4 = intArrayOf()
    println(Solution().merge(arr3, 1, arr4, 0)) // [1]
    println(arr3.toList())
    println()

    println("Test case 3:")
    val arr5 = intArrayOf(0)
    val arr6 = intArrayOf(1)
    println(Solution().merge(arr5, 0, arr6, 1)) // [1]
    println(arr5.toList())
    println()

    println("Test case 4:")
    val arr7 = intArrayOf(2, 0)
    val arr8 = intArrayOf(1)
    println(Solution().merge(arr7, 1, arr8, 1)) // [1, 2]
    println(arr7.toList())
    println()

    println("Test case 5:")
    val arr9 = intArrayOf(4, 0, 0, 0, 0, 0)
    val arr10 = intArrayOf(1, 2, 3, 5, 6)
    println(Solution().merge(arr9, 1, arr10, 5)) // [1,2,3,4,5,6]
    println(arr9.toList())
    println()
}

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var p1 = m - 1
        var p2 = n - 1
        var i = m + n - 1
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i--] = nums1[p1--]
            } else {
                nums1[i--] = nums2[p2--]

            }

        }
    }
}
