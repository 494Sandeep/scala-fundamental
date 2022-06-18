package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movieName: String): Boolean = movieName == favoriteMovie
    def hangingOutWith(person: Person): String =
      s"$name is hanging out with ${person.name}"

    def unary_! : String = s"$name, What the hell is this. !"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isLovely: Boolean = true

    def apply(): String = s"Love you ${this.name}"
    def apply(n: Int): String = s"Love you $name $n times"
  }

  val poo = new Person("Poonam", "Ironman")
  val deep = new Person("Sandeep", "Thor")

  // Infix Notations = Operator Notations (Synthetic Sugar)
  println(poo.likes("Ironman"))
  println(poo likes "Ironman") //This are equivalent
  println(deep hangingOutWith poo)
  println(deep.hangingOutWith(poo))
  println(3 + 5) //are equivalent to below line
  println(3.+(5))
  // All operators are methods

  // Prefix Notations
  val x = +2 // this equivalent to 2.unary_+
  val y = 2.unary_+
  // Unary operand are + - ! ~
  println(poo.unary_!) // This two are also equivalent
  println(!poo)

  // Postfix Notations
  println(poo.isLovely)
  println(poo isLovely)

  //apply
  println(poo())
  println(poo.apply())

  println((+(+poo)).age) // 2 will be return
  println(poo(3000)) // "Love you Poonam 3000 times

}
