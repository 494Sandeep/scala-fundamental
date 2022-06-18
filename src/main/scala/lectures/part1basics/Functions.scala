package lectures.part1basics

import scala.annotation.tailrec
import scala.collection.mutable.ArrayBuffer

object Functions extends App {

  def greeting(name: String, age: Int): String =
    s"Hi, My name is $name and i am about to $age year old"

  println(greeting("Unnati", 1))

  @tailrec // 1 * 2 * 3 * 4 ... * n
  def getFactorial(n: Int, factorial: Int = 1): Int = {
    if (n == 1) {
      factorial
    } else
      getFactorial(n - 1, factorial * n)
  }
  println("Factorial :  " + getFactorial(6))

  @tailrec
  def isPrime(num: Int, n: Int = 2): Boolean = {
    if (num == n)
      true
    else if (num % n == 0)
      false
    else isPrime(num, n + 1)
  }
  println(s"Prime : " + isPrime(15))

  @tailrec
  def getLeastCommonFactor(num: Int, n: Int = 2): Boolean = {
    if (num % n == 0) {
      println(s"Least Common Factor : $n")
      false
    } else getLeastCommonFactor(num, n + 1)
  }
  getLeastCommonFactor(59)

  def concatenateString(str: String, n: Int): String = {
    @tailrec
    def helperFunction(catStr: String, acc: Int): String = {
      if (acc == 1) catStr
      else helperFunction(str.concat(catStr), acc - 1)
    }
    helperFunction(str, n)
  }

  println(concatenateString("_S", 20))

}
