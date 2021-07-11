package com.leetcode.random_problems.easy.defang_ip_address

fun main() {
    println("Test case 1:")
    println(Solution().defangIPaddr("1.1.1.1")) // "1[.]1[.]1[.]1"
    println()

    println("Test case 2:")
    println(Solution().defangIPaddr("255.100.50.0")) // "255[.]100[.]50[.]0"
    println()

}

class Solution {
    fun defangIPaddr(address: String): String {
        return address
            .toCharArray()
            .map { element -> if (element == '.') "[.]" else element.toString() }
            .joinToString(separator = "", prefix = "", postfix = "") { it }
    }
}
