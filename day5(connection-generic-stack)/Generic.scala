object Generic extends App{
  abstract class Divide[z]{
    def divide(u:z, v:z):z
  }
  class intDivide extends Divide[Int]{
    override def divide(u: Int, v: Int): Int = u/v
  }
  class doubleDivide extends Divide[Double]{
    override def divide(u: Double, v: Double): Double = u/v

  }
  val num1=new intDivide().divide(13,6)
  val num2=new doubleDivide().divide(13,6)
  println(num1)
  println(num2)
}