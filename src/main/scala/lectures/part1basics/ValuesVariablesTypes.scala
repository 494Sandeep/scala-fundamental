package lectures.part1basics

object ValuesVariablesTypes extends App {

  // VAL are immutable that means you can't change value once assign
  val x: Int = 29;

  // VAR are mutable that means you can change values after assignment or This is also refer as side effects
  var y: Int = 30
  y = 31 // side Effects

  val isFlag: Boolean = true // true or false

  val aByte: Byte =
    45 // 1 byte -> 8-bit signed two’s complement integer (-2^7 to 2^7-1, inclusive) -128 to 127
  val aShort: Short =
    789 // 2 bytes -> 16-bit signed two's complement integer (-2^15 to 2^15-1 inclusive) -32,768 to 32,767
  val num: Int =
    25 // 4 bytes -> 32-bit signed two's complement integer (-2^31 to 2^31-1 inclusive)
  val aLong: Long =
    78967L // 8 bytes -> 64-bit two’s complement integer (-2^63 to 2^63-1, inclusive)

  val aFloat: Float = 3.0f // 4 bytes -> 32-bit IEEE 754 single-precision float
  val aDouble: Double =
    3.14 // 8 bytes -> 64-bit IEEE 754 double-precision float

  val aChar: Char =
    'S' // 16-bit unsigned Unicode character (0 to 2^16-1, inclusive) 0 to 65,535

  val str: String = "Apple" // a sequence of Char

  //  For large numbers Scala also includes the types BigInt and BigDecimal
  var aBigInt = BigInt(1234567890)
  var aBigDecimal = BigDecimal(123456.789)

}
