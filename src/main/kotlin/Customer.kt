package my.demo

import java.awt.Rectangle
import java.io.File
import java.math.BigDecimal

//import java.lang.IllegalStateException

// DTO(POJO/POCO) 만들기
data class Customer(val name: String, val email: String)

fun main2() {
    // 함수 매개변수의 기본값
    fun foo(a: Int = 0, b: String = "") {}

    // 목록 필터링
    val list = listOf(0, 1, 2, 3)
    val positives = list.filter{x -> x>0}
    val positives2 = list.filter{it > 0}

    // 컬렉션에 요소가 있는지 확인
    val emailsList = listOf("hihi")
    if ("john@example.com" in emailsList) {

    }

    val name = "jun"
    println("Name $name")

    // 인스턴스 체크
    when (name) {
        is String -> println(1)
//        is Customer -> println(2)
        else -> println(3)
    }

    // Read-only list
    val list2 = listOf("a", "b", "c")
    // Read-only map
    val map = mapOf<String, Number>("a" to 1, "b" to 2, "c" to 3)
    // 수정 가능
    val map2 = mutableMapOf<String, Number>("one" to 1, "two" to 2)
    map2["three"] = 3
    map2.remove("one")

    // map 접근
    println(map["key"])
//    map["a"] = 5

    // 맵 또는 리스트 탐색
    for ((k, v) in map) {
        println("$k -> $v")
    }

    // Iterate over a range
    for (i in 1..100) {} // 100 포함
    for (i in 1 until 100) {} // 100 미포함
    for (x in 2..10 step 2) {} // 2 간격
    for (x in 10 downTo 1) {
        println(x)
    } // 1씩 감소
    (1..10).forEach { _ -> }

    // Lazy property
//    val p: String by lazy {
//        // 초기화 코드
//    }
//    p = "abc"

    // 함수 확장
    fun String.spaceToCamelCase() {
    }
    "Convert this to camelcase".spaceToCamelCase()



}

// 싱글톤 생성
object Resource {
    val name = "Name"
}

// 추상 클래스 인스턴스화
abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}

fun hi() {
    object  {
        val name = "Name"
    }
    val res = Resource
    val myObject = object : MyAbstractClass() {
        override fun doSomething() {
            TODO("Not yet implemented")
        }

        override fun sleep() {
            TODO("Not yet implemented")
        }
    }
    myObject.doSomething()

    // if not null
    val files = File("Test").listFiles()
    println(files?.size)
    println(files?.size ?: "empty")

    val filesSize = files?.size ?: run {
        println(2)
    }
    println(filesSize)

    // if null
    val values = mapOf<String, String>("me" to "a", "email" to "email", "asf" to "Sf")

    // Execute a statement if null
    val email = values["email"] ?: throw IllegalStateException("Email is missing!")

    // Get first item of a possibly empty collection
    val emails = "asfadsf"
    val mainEmail = emails.firstOrNull() ?: ""

    // Execute if not null
    values?.let {

    }

    // Return on when statement
    fun transform(color: String): Int {

        val result = try {
            println("try")
        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }

       try {
            print("adf")
        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }

        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalStateException("Invalid color param value")
        }

    }

}

fun ifif() {
    val x = 1
    val y = if (x == 1) {
        "one"
    } else if (x == 2) {
        "two"
    } else {
        "other"
    }

    if (x == 1) {
        println(1)
    } else if (x == 2) {
        println(2)
    } else {
        println(3)
    }
}

fun theAnswer() = 42
fun theAnswer2(): Int {
    return 42
}

// Call multiple methods on an object instance (with)
fun aho() {
    class Turtle {
        fun penDown() {}
        fun penUp() {}
        fun turn(degrees: Double) {}
        fun forward(pixels: Double) {}
        var test: String = "String"
    }

    // Configure properties of an object (apply)
    val myTurtle = Turtle().apply { test = "Number" }

    with(myTurtle) {
        println(test)
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

    // Nullable Boolean
    val b: Boolean? = true
    if (b == true) {
        println("wow")
    }

    var aa = 1
    var bb = 2
    aa = bb.also { bb = aa }
}

fun main() {
    var a = 1
    var b = 2
    // Swap two variables
    a = b.also {
        println(a)
        b = a
    }
    println(a)

    // Mark code as incomplete (TODO)
    fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")
    println(calcTaxes())
    println("wow")
}



