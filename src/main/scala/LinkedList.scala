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

  def removeFirstElement(): Unit = {
    if (head == null) return
    head = head.next
  }

  def getLastElement(): Node = {
    if (head == null) return null
    var n: Node = head
    while (n.next != null) {
      n = n.next
    }
    return n
  }

  def addToEnd(element: String): Unit = {
    val last: Node = getLastElement()
    val n: Node = new Node(element, null)
    if (last == null) {
      head = n
    } else {
      last.next = n
    }
  }

  def isPresent(e: String): Boolean = {
    var n: Node = head
    while (n != null) {
      if (n.item == e) return true
      n = n.next
    }
    return false
  }
}
