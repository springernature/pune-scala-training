class Assignment1 {
}

object Assignment1 {

  def main(args: Array[String]) = {
    println("Assignment 1")
    print(parseOpr("7*2"))
  }

  //val addOp:(Int,Int)=>Int = (a,b)=> a+b // add(a: Int, b: Int): Int = a + b

 // def subtract(a: Int, b: Int): Int = a - b

 // def divide(a: Int, b: Int): Int = a / b

 // def multiply(a: Int, b: Int): Int = a * b

  def parseOpr(data: String): Int = {
    val firstValStr: Int = data.slice(0, 1).toInt
    val operator = data.slice(1, 2)
    val lastValStr = data.slice(2, 3).toInt
    val result = getOp(operator)(firstValStr, lastValStr)
    result
    }



  def getOp(operator:String)  = {
  val result = operator match {
    case "+" => (a:Int, b: Int)=> a+b
    case "-" => (a:Int, b: Int)=> a-b
    case "/" => (a:Int, b: Int)=> a/b
    case "*" => (a:Int, b: Int)=> a*b
  }
  result
}

 // def operation(firstValStr: Int, lastValStr: Int, fun: (Int, Int) => Int): Int = {
  //  val result = fun(firstValStr, lastValStr)
//    result
 // }
}
