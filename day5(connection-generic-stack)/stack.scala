object stack extends App {
  class Stack[A]{
    private var elements: List[A]=Nil
    def push (x:A):Unit=elements =x::elements
    def peak: A=elements.head
    def pop():A={
      var tos =peak
      elements=elements.tail
      tos
    }
  }
  val list = List(1, 2, 3, 4)
  val stack = new Stack[Int]
  stack.push(5)
  stack.push(6)
  println(stack.pop())
  stack.push(7)
  println(stack.pop())

}
