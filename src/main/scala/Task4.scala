object Task4 {
  def main(args: Array[String]): Unit = {
    var flightList:LinkedList = new LinkedList()
    println(flightList)
    flightList.addToStart("Rome")
    println(flightList)
    flightList.addToStart("Paris")
    println(flightList)
    flightList.addToStart("Tokyo")
    println(flightList)
  }
}
