object Task5 {
  def main(args: Array[String]): Unit = {
    val list: LinkedList = new LinkedList()
    list.addToStart("B")
    println(list)
    list.addToStart("A")
    println(list)
    list.addToEnd("C")
    println(list)
    list.addToEnd("D")
    println(list.isPresent("A"))
    list.removeFirstElement()
    println(list)
    println(list.isPresent("A"))
    println(list.getLastElement().item)
  }
}
