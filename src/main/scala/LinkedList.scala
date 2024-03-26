import scala.collection.mutable.ArrayBuffer

class LinkedList {
  var head: Node = null

  def addToStart(s: String): Unit = {
    head = new Node(s, head)
  }

  def getSize(): Int = {
    var count: Int = 0
    var n: Node = head

    while (n != null) {
      count += 1
      n = n.next
    }

    return count
  }

  override def toString: String = {
    val nodes: ArrayBuffer[String] = ArrayBuffer()
    var n: Node = head
    while (n != null) {
      nodes.addOne(n.item)
      n = n.next
    }
    nodes.addOne(null)

    return s"List content (size ${getSize()}) : ${nodes.mkString(" -> ")}"
  }
}
