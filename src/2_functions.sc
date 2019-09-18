object MathApp{

  def  main(args: Array[String]) =
    println("welcome to scala training")

}

MathApp.main(Array())

val add: (Int,Int)=>Int=(a,b)=>a+b

val sub: (Int,Int)=>Int=(a,b)=>a-b


val multiOp: (Int,Int)=>Int=(a,b)=>a*b

val divOp:(Int,Int)=>Int=(a,b)=>a/b


def calculator1(a:String):Int= {

  val x=a.charAt(0).toString.toInt
  val y=a.charAt(2).toString.toInt

  a.charAt(1) match {
    case '+' => add(x,y);
    case '-' => sub(x,y);
    case '/' => divOp(a.charAt(0).toInt, a.charAt(2).toInt);
    case '*' => multiOp(a.charAt(0).toInt, a.charAt(2).toInt);

  }
}

calculator1("7/2")


