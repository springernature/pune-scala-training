val a =10
val b="Hello"
// val is final var is variable
//most of data types are wrapper classes of java (Integer etc)

object Sample { // similar to static or singleton

  def main(args: Array[String]) = { //public is implicit
    println("welcome to scala training...")
  }
}

Sample.main(Array())

lazy val name = "raj" //this will assign only when we use it
println(name)

def add(a:Int, b:Int):Int= {
  println(a+b)
  a+b
}

def add1(a:Int, b:Int):Unit= { // Unit is similar to void
  println(a+b)
}
val sumAdd1=add1(90,20)
//sumAdd1.isInstanceOf// check it is instnace of
add(5,5)

//we cant assign higher data types to lower data types
// val a:Int = Double(10.0) //error

val nullVal = null //Instance of Null
val nothingVal = None //Instance of nothing

def triple(a:Int):Int = a*3

val tripleLogic=triple(_)
val doubleOp:(Int=>Int)=a=>a*2
val mutiplyOp:(Int, Int)=>Int = (a,b)=>a*b

doubleOp(5)

def operation(a:Int, b:Int, fun:(Int,Int)=>Int):Int= {
  fun(a, b)
}

operation(10, 20, add)
operation(10,30, (a,b)=>a+b) //run time logic

def anyOp(fun:()=>Unit):()=>Unit={
  fun
}

anyOp(()=>println("Hello"))
//pure function - example add() method this will add operation at compile type and so will be faster at run time
//



