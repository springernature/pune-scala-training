
def add(a:Int,b:Int)={
  a+b
}

def sub(a:Int,b:Int)={
  a-b
}

def multiply(a:Int,b:Int)={
  a*b
}

def divide(a:Int,b:Int)={
  b/a
}

def operation(s:String) = {

  val s1: Array[Char] = s.toCharArray
  val opd1 = s1(0).toString.toInt
  val opr = s1(1).toString
  val opd2 = s1(2).toString.toInt

opr match {
  case "+"=> add(opd1,opd2)
  case "-"=>sub(opd1,opd2)
  case "*"=>multiply(opd1,opd2)
  case "/"=>divide(opd1,opd2)
  }

}

operation("5+2")
operation("5-2")
operation("5*2")
operation("6/2")
