fun main() {
    /**
     * Integer types
     *  Byte: 8 bits
     *  Short: 16 bits
     *  Int: 32 bits
     *  Long: 64 bits
     */
    val byteMin: Byte = -128
    val byteMax: Byte = 127

    val shortMax: Short = 32_767
    val shortMin: Short = -32_768

    val intMax: Int = 2_147_483_647
    val intMin: Int = -2_147_483_648

    /**
     * Floating-point types
     *  Float: 32 bits
     *  Double: 64 bits
     */
    val pi: Double = 3.14
//  val one: Double = 1 Error: type mismatch
    val oneDouble: Double = 1.0
    val e = 2.7_182_818_284
    val eFloat = 2.7_182_817f

    fun printDouble(d: Double) {print(d)}

    val i = 1
    val d = 1.0
    val f = 1.0f

    printDouble(d)
//    printDouble(i) Error: Type mismatch
//    printDouble(f) Error: Type mismatch

    val decimals = 123
    val longs = 123L
    val hexadecimals = 0x0F
    val binaries = 0b00_001_011

    // Numbers representation on the JVM
    /**
     * ==: 변수의 value 확인
     * ===: 객체나 변수의 참조 (reference) 확인
     */
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA)
    println(boxedB === anotherBoxedB)

    // Explicit number conversions
//    val aaa: Int? = 1
//    val bbb: Long? = aaa
//    print(bbb == aaa)

    val bbb: Byte = 1
    val i1: Int = bbb.toInt()

    // Operations on numbers
    println(1 + 2)
    println(2_500_000_000L - 1L)
    println(3.14 * 2.71)
    println(10.0 / 3)

    // Division of integers
    val x = 5 / 2
    println(x == 2)
    val y = 5L / 2
    println(y == 2L)

    val x2 = 5 / 2.toDouble()
    println(x2 == 2.5)

    // Bitwise operations  비트연산
    /**
     * 1. and (비트 AND): 두 비트의 값이 모두 1이면 1을 반환합니다.
     * 2.
     */
    val x3 = (1 shl 2) and 0x000FF000
 }

fun unsigned() {
    val b: UByte = 1u
    val s: UShort = 1u
    val l: ULong = 1u

    val a1 = 42u
    val a2 = 0xFFFF_FFFF_FFFFu
    val a3 = 1UL
}

fun booleans() {
    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse)
    println(myTrue && myFalse)
    println(!myTrue)
}

fun characters() {
    /**
     * \t: tab
     * \b: backspace
     * \n: new line
     * \r: carriage return
     * \': '
     * \": "
     * \\: \
     * \$: $
     */
    println('\n')
    println('\\')
    println("\$a")
}