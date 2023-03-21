// Package definition and imports
package my.demo
import kotlin.text.*

fun main() {
    //  Program entry point
    println("안녕하세요!")
    println("안녕하세요!")
    // Print to the standard output
    print("안녕하세요!")
    print("안녕하세요!")

    // Functions
    fun sum(a: Int, b: Int): Int {
        return a+b
    }

    fun sum2(a: Int, b: Int) = a+b

    // Unit: void, 생략 가능
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a+b}")
    }

    println("")
    println(sum(1, 2))
    println(sum2(1, 3))
    printSum(2, 4)

    // Variables
    val a: Int = 1 // 즉시 할당
    val b = 2 // Int type 동적 할당
    val c: Int
    c = 3 // 지연 할당

    var x = 5
    x += 1 // 코틀린에서의 var는 js에서의 let과 같은듯

    // Creating classes and instances
    // open: 상속 가능하다는 의미
    open class Shape

    class Rectangle(var height: Double, var length: Double): Shape() {
        var perimeter = (height + length) * 2
    }

    val rectangle = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")

    // String templates
    var aa: Int = 1
    val s1 = "a is $aa"

    aa = 2
    val s2 = "${s1.replace("is", "was")}, but now is $aa"
    println(s2)

    // Conditional expressions
    fun maxOf(a: Int, b: Int):Int {
        if (a>b) {
            return a
        } else {
            return b
        }
    }

    fun maxOf2(a: Int, b: Int) =
        if (a>b) a
        else b

    println(maxOf(3, 5))
    println(maxOf2(3, 5))

    // for loop
    val items = listOf<String>("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    // while loop
    val items2 = listOf<String>("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items2.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    // when expression
    fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }
    println(describe(1))

    // Ranges
    val z = 10
    val y = 9
    if (z in 1..y+1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }

    if (-1 !in 0..list.lastIndex) println("-1 is out of range")

    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    for (x in 1..5) {
        print(x)
    }
    println()
    for (x in 1..5 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    // Collections
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}