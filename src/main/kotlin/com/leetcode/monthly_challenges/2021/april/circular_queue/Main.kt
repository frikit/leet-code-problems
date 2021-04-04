package com.leetcode.monthly_challenges.`2021`.april.circular_queue

fun main() {
    println("Test case 1:")
    val mcq = MyCircularQueue(5)
    println("" + mcq.enQueue(5) + "==" + true) //5
    println("" + mcq.deQueue() + "==" + true) //5
    println("" + mcq.deQueue() + "==" + false) //nothing
    println("" + mcq.isFull() + "==" + false) //not full
    println("" + mcq.isEmpty() + "==" + true) //is empty
    println()

    println("" + mcq.enQueue(9) + "==" + true) //9
    println("" + mcq.Front() + "==" + 9) //9
    println("" + mcq.Rear() + "==" + 9) //9
    println("" + mcq.enQueue(99) + "==" + true) //9
    println("" + mcq.Front() + "==" + 9) //9
    println("" + mcq.Rear() + "==" + 99) //99
    println("" + mcq.isEmpty() + "==" + false) //is not empty
    println()

    println("" + mcq.enQueue(99) + "==" + true) //99
    println("" + mcq.enQueue(999) + "==" + true) //999
    println("" + mcq.enQueue(9999) + "==" + true) //9999
    println("" + mcq.enQueue(99999) + "==" + false) //99999 -> is full
    println()


    println()
}

class MyCircularQueue(val k: Int) {
    val stack = ArrayDeque<Int>(k)

    fun enQueue(value: Int): Boolean {
        if (isFull()) return false

        stack.addLast(value)

        return true
    }

    fun deQueue(): Boolean {
        if (isEmpty()) return false

        stack.removeFirst()

        return true
    }

    fun Front(): Int {
        return if (isEmpty()) -1 else stack.first()
    }

    fun Rear(): Int {
        return if (isEmpty()) -1 else stack.last()
    }

    fun isEmpty(): Boolean {
        return stack.isEmpty()
    }

    fun isFull(): Boolean {
        return stack.size == k
    }

}
