
object ImplicitExample extends App with ImplicitUtils {

  def getValue = "10"

  val value:Int = getValue  //exp, method call, cal
  println("hello")

  def addNumbers(a:Int)(implicit b:Int) = {
    a+b
  }


  val output = addNumbers(10)
  println(output)

  val numbers = List(5,4,6, 12, 22, 3, 4)
  println(numbers.sorted)



}
