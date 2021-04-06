import scala.util.Random
object connection extends App {
  class Connection {
    def connect="Connected to the internet"
  }
  object Connection {
    val random = new Random(System.nanoTime())
    def apply(host: String, port: String): Option[Connection] = {
      if (random.nextBoolean) Some(new Connection)
      else None
    }
  }
  lazy val config : Map[String,String] =Map("host"->"192.16.1.8","port"->"80")
  val host =config.get("host")
  val port=config.get("port")
  lazy val connection =host .flatMap(h=>port.flatMap(p=>Connection(h,p)))
  var connectionStatus =connection.map(c=>c.connect)
  println(connectionStatus)
  connectionStatus.foreach(println)
  println(host)
  println(port)

}
