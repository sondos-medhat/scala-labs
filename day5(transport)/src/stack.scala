import Transport.Transport

object stack extends App{
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
  class Transport
  class Train extends Transport
  class Car extends Transport

  val list = List[Transport]()
  val train = new Train
  val car = new Car
  val stack = new Stack[Transport]
  stack.push(train)
  stack.push(car)
  var theval=stack.pop()
  println(theval)

}
