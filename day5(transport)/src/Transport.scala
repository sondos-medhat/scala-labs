object Transport extends App{
  abstract class Transport {
  }

  class Train extends Transport {
    val Type = "public"
  }
  class Car extends Transport {
    val Type = "private"
  }

  val train = new Train
  val car = new Car
  println(train.Type)
  println(car.Type)
}
