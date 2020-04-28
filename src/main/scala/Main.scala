object Main extends App {

  val v = "world"
  println(s"Hello $v")

  implicit val x: Int = 42

  def fun1(implicit a: Int) = println(a)

  fun1

}
