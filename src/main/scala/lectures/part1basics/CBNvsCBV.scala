package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    println(s"By value: $x")
    println(s"By value: $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"By value: $x")
    println(s"By value: $x")
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = println(x)

  //  printFirst(infinite(), 34) // stack overflow
  printFirst(34, infinite())
  // in the above infinite() doesn't call and throw error
  // because it not been called in the definition of functions

}
