val a:Int =10



// static class
object Sample  {

  def main(args: Array[String]) =
    println("welcome to scala training")

}

Sample.main(Array())


//val sum=add(5,7)


//object comparison Unit can be used
//sum.isInstanceOf[Unit]

def add(a:Int,b:Int):Int={
  a+b



}

def triple(a:Int):Int=a*3

val tripleLogic:(Int=>Int)=triple(_)
val addOp=add(_,_)


val doubleOp:(Int =>Int )=a => a*2

val multipleOp:(Int,Int)=>Int=(a,b)=>a*b


//println(add(7,8))



def operation(a:Int,b:Int,fun:((Int,Int)=>Int)):Int={
  fun(a,b)
}


operation(5,5,add)



def anyOp(fun:()=>Unit):()=>Unit={
  fun
}


anyOp(()=>println("balaji"))