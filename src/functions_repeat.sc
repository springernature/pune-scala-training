val a = 10
val b = 20

val name = ""

val result = add(1,2)

def add(a:Int, b:Int) = {
  a + b
}

val addOp: ((Int, Int) => Int) = add(_, _)
val addOpAn: ((Int, Int) => Int) = (a, b) => a + b

val square = (a:Int) => a*a
val cube = (a:Int) => a*a

def operation(a:Int, b:Int, op: (Int, Int) => Int) = {
  op(a,b)
}

def singleOp(a:Int, op: Int => Int) = {
  op(a)
}

def determineOperation(op:String): (Int, Int) => Int = {
  op match{
    case "+" => (x, y) => x + y
    case "-" => (x, y) => x - y
    case _ => throw new RuntimeException("invalid op " + op)
  }
}

operation(1,2, add)
operation(1,2, addOp)
operation(1,2, addOpAn)
operation(1,2, (x, y) => x + y)

singleOp(10, square)
singleOp(10, cube)
singleOp(10, i => i+1)


val addOprCalc  = determineOperation("+")
addOprCalc(3,4)

val numbers = List(1,2,3, 4, 5, 6)
val filtered = numbers.filter( i => i % 2 ==0)