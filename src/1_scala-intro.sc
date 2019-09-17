val a =10

object Sample {

   def main(args: Array[String]) = {
    println("welcome to scala training")
  }

  // Each class is child of scala.Predef
  // TODO : How to use Nothing, None, Nil and Null in Scala
  // TODO : Create a class with methods add,sub, divide anb multiply
  // TODO : Input No<OP> as String
  // TODO : Capture as 3 parts
  // TODO : determine the operation using function, input = String, output = function(Int, Int-> Int)
  // TODO : Apply the fuction and return the result
}

Sample.main(Array())

lazy val name = "Gunjan"

def add(a:Int, b:Int): Int = {
  a+b
}


println(add(2,3))
var sum = add(2,3)
sum.isInstanceOf[Unit]
val number = 10.00f
val number2 = 10.00d

val doubleOp : (Int => Int) = (a => a * 2)
def tripleOp : (Int => Int) = (a => a * 3)
doubleOp(4)