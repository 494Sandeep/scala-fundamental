package lectures.part2oop

object Generics extends App {
  val rs1 = new ResultSet[MConfig](MConfig("TunningParameters"))
  val rs2 = new ResultSet[RIConfig](RIConfig(List(1, 2)))
  val rs3 = new ResultSet[String]("Sandeep")

  println(s"Matching Config: ${rs1()}")
  println(s"RunInstance Config: ${rs2()}")
  println(s"resultSet3: ${rs3()}")
}

class ResultSet[T](payload: T) {
  def apply(): String = s"${payload}"
}

class MConfig(tuningParam: String)
class RIConfig(watchlist: List[Int])

// Variance in Generics
