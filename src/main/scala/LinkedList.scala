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

  def findElement(s: String): Node = {
    var n: Node = head
    while (n != null) {
      if (n.item == s) return n
      n = n.next
    }
    return null
  }

  def swapElements(e1: String, e2: String): Unit = {
    val n1: Node = findElement(e1)
    val n2: Node = findElement(e2)
    if (n1 == null || n2 == null) return

    n1.item = e2
    n2.item = e1
  }

  def removeLastElement(): Unit = {
    var n: Node = head
    if (n == null) return
    while (n.next != null) {
      if (n.next.next == null) {
        n.next = null
        return
      }
      n = n.next
    }
    head = null
  }

  def removeElement(e: String): Unit = {
    var n: Node = head
    if (n == null) return
    while (n.next != null) {
      if (n.next.item == e) {
        n.next = n.next.next
        return
      }
      n = n.next
    }
    head = head.next
  }

  def insertAfter(before: String, after: String): Unit = {
    val n: Node = findElement(before)
    if (n == null) return
    val n3: Node = n.next
    val n2: Node = new Node(after, n3)
    n.next = n2
  }
}
