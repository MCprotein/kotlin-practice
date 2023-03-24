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



 }