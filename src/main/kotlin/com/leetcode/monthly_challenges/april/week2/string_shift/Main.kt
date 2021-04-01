package com.leetcode.monthly_challenges.april.week2.string_shift

fun main() {
    println("Test case 1:")
    println(Solution().stringShift("abc", arrayOf(intArrayOf(0, 1), intArrayOf(1, 2))) + " == " + "cab")
    println()

    println("Test case 2:")
    println(
        Solution().stringShift(
            "abcdefg",
            arrayOf(intArrayOf(1, 1), intArrayOf(1, 1), intArrayOf(0, 2), intArrayOf(1, 3))
        ) + " == " + "efgabcd"
    )
    println()
}

class Solution {
    fun stringShift(s: String, shift: Array<IntArray>): String {
        val chars = s.toCharArray().toMutableList()

        shift.forEach {
            swap(chars, it)
        }
        return chars.joinToString(separator = "")
    }

    private fun swap(actualList: MutableList<Char>, pair: IntArray) {
        val currentIndex = 0
        val targetIndex = if (isLeft(pair)) actualList.size else pair[1] - 1

        repeat(pair[1]) {
            if (isLeft(pair)) {
                actualList.add(targetIndex, actualList[currentIndex])
                actualList.removeAt(currentIndex)
            } else {
                actualList.add(0, actualList.last())
                actualList.removeAt(actualList.size - 1)
            }
        }
    }

    private fun isLeft(pair: IntArray): Boolean {
        return pair[0] == 0
    }
}
