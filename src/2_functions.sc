object MathApp{

  def  main(args: Array[String]) =
    println("welcome to scala training")

}

MathApp.main(Array())

def add (a:Int,b:Int):Int={
  a+b
}

def sub(a:Int,b:Int):Int={
  a-b
}

val multiOp: (Int,Int)=>Int=(a,b)=>a*b

val divOp:(Int,Int)=>Int=(a,b)=>a/b


def calculator(a:Int,b:Int,fun:((Int,Int)=>Int)):Int={
  fun(a,b)
}


def calculator1(a:String):Int= {


  a.charAt(0) match {
    case '+' => add(a.charAt(0), a.charAt(2))
    case '-' => sub(a.charAt(0), a.charAt(2))
    case '/' => divOp(a.charAt(0), a.charAt(2))
    case '*' => multiOp(a.charAt(0), a.charAt(2))

  }
}

calculator1("5+6")


