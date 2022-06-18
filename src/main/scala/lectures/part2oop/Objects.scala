package lectures.part2oop

object Objects extends App {

  // SCALA DOES NOT HAVE CLASS_LEVEL FUNCTIONALITY ("static")
  // Objects can not have parameters
  object Car { // type + its only instance
    // static / class - level functionality
    val wheel: Int = 4
    def canFly: Boolean = false

    // factory method
    def apply(brandName: String, modalName: String): Car = new Car("Kiger")
  }
  class Car(name: String) {
    // Instance-level functionality
  }

  // COMPANIONS
  // When both object and class is declare with same name

  val car1 = Car
  val car2 = Car
  println(s"Wheel :${car1.wheel}") // 4
  println(car1("Renault", "Kiger RXZ AMT dual tone"))

  println(s"Object Instance : ${car1 == car2}") // true -> because same instance

  val car3 = new Car("Kiger")
  val car4 = new Car("Kiger")
  println(s"Class Instance : ${car3 == car4}") // false -> different instance

  // Scala Applications = scala object with
  // def main(args: Array[String]): Unit
  // is equal to extends App

}
