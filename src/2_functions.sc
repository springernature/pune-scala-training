def add(a:Int, b:Int):Int = {
  val c = a+b
  c
}

def triple(a:Int) = a * 3

val tripleLogic : (Int => Int) = triple(_)

val addOp = add(_, _)

val doubleOp: (Int => Int) = (a) => a*2

val multipleOp : (Int,Int) => Int = (a, b) => a * b

doubleOp(5)
multipleOp(7, 8)


def operation(a:Int, b:Int, fun:((Int,Int) => Int)) = {
  fun(a, b)
}


operation(5, 10, add)
operation(5, 10, addOp)
operation(5, 10, (a,b) => a+b)


def anyOp(fun: () => Unit) = {
  fun
}

anyOp(() => println("Piyush"))
