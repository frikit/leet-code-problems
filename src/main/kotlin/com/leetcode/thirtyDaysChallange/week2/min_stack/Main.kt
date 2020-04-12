package com.leetcode.thirtyDaysChallange.week2.min_stack

import java.util.*

fun main() {
    val minStack = MinStack()
    minStack.push(-2)
    println(minStack.getMin() == -2)
    println(minStack.top() == -2)
    println()

    minStack.push(0)
    println(minStack.getMin() == -2)
    println(minStack.top() == 0)
    println()

    minStack.push(-3)
    println(minStack.getMin() == -3)
    println(minStack.top() == -3)
    println()

    minStack.push(0)
    println(minStack.getMin() == -3)
    println(minStack.top() == 0)
    println()

    minStack.pop()
    println(minStack.getMin() == -3)
    println(minStack.top() == -3)
    println()

    minStack.pop()
    println(minStack.getMin() == -2)
    println(minStack.top() == 0)
}

class MinStack {

    val min = PriorityQueue<Int>()
    val stack = Stack<Int>()

    fun push(x: Int) {
        min.add(x)
        stack.push(x)
    }

    fun pop() {
        val pop = stack.pop()
        min.remove(pop)
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return min.elementAt(0)
    }

}
