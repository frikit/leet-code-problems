package com.leetcode.monthly_challenges.april.week2.min_stack

import java.util.*

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.


Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.

 */
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
