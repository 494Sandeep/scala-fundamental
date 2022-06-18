package lectures.part1basics

object Expressions extends App {
  // Everything in scala is an EXPRESSIONS

  val aExpression = 1 + 3 // This 1 + 2 is Expressions

  var aVariable = 2
  aVariable *= 3 // side effects
  println(s"aVariable: $aVariable")

  // Instructions (DO)  vs  Expressions (VALUE)
  val x = 3
  val isBelowTen = if (x < 10) true else false // IF Expressions

  var i = 0;
  val aWhile = while (i < 10) {
    i += 1
  }
  println(s"aWhile : $aWhile") // Returns a UNIT

  // Code block return the last statement value
  val aCodeBlock = {
    val age = 5
    if (age < 20) "Young" else "Old"
  }
  println(aCodeBlock) // Young
}
