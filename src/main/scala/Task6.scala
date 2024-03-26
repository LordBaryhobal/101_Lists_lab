object Task6 {
  def main(args: Array[String]): Unit = {
    val list: LinkedList = new LinkedList()
    list.addToEnd("A")
    list.addToEnd("B")
    list.addToEnd("C")
    list.addToEnd("D")
    list.addToEnd("E")
    println(list)
    println(list.findElement("C"))
    list.swapElements("B", "D")
    println(list)
    list.removeLastElement()
    println(list)
    list.removeElement("C")
    println(list)
    list.insertAfter("D", "F")
    println(list)
  }
}
