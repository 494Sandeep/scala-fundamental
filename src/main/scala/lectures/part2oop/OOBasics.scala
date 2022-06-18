package lectures.part2oop

object OOBasics extends App {
  val p1 = new Person("Sandeep", 26)
  // println(p1.age) // this will give error because age is parameters
  println(p1.name) // this will work because name is field of class person

  println(p1.x)
  //here value is 4 and then 10, because body of class is been evaluate when a class being instantiation
  p1.greet("Poonam")
  p1.greet()

}
// constructor
class Person(val name: String, age: Int = 0) {
  val x = 10
  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name")

  // overloading
  def greet(): Unit = println(s"It's me $name")

  // Auxiliary constructor
  def this(name: String) = this(name, 1)

}
// class parameters are not FIELDS
