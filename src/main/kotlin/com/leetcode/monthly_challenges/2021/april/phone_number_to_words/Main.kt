package com.leetcode.monthly_challenges.`2021`.april.phone_number_to_words


fun main() {
    println("Test case 1:")
    println(Solution().letterCombinations("23"))//["ad","ae","af","bd","be","bf","cd","ce","cf"]
    println()
    println("Test case 2:")
    println(Solution().letterCombinations(""))//[]
    println()
    println("Test case 3:")
    println(Solution().letterCombinations("1"))//[]
    println()
    println("Test case 4:")
    println(Solution().letterCombinations("0"))//[]
    println()
}

class Solution {
    companion object {
        val keypad = mutableMapOf<Char, CharArray>().apply {
            put('2', "abc".toCharArray())
            put('3', "def".toCharArray())
            put('4', "ghi".toCharArray())
            put('5', "jkl".toCharArray())
            put('6', "mno".toCharArray())
            put('7', "pqrs".toCharArray())
            put('8', "tuv".toCharArray())
            put('9', "wxyz".toCharArray())
        }
    }

    fun letterCombinations(digits: String): List<String> {
        var result: MutableList<String> = ArrayList()
        if (digits.isEmpty() || digits == "1" || digits == "0") return result

        result.add("")
        for (element in digits) result = combine(keypad[element]!!, result)
        return result
    }

    fun combine(digit: CharArray, l: List<String>): MutableList<String> {
        val result: MutableList<String> = ArrayList()
        for (element in digit)
            for (x in l)
                result.add(x + element)
        return result
    }
}
