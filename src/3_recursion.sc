import scala.annotation.tailrec
//factorial example using iteration
//3 = 3 * 2 * 1

def factorialItr(i:Int) = {
  val n = 1
  var fact = 1
  for(n <- 1 to i) {
    fact = fact * n
  }
  fact
}

factorialItr(5)

//factorial example using recursion

def factorialRec(i:Int):Int = {
  if(i <= 1)
    1
  else
    i * factorialRec(i -1)
}

factorialRec(5)




//factorial example using tail recursion
@tailrec
def factorialTailRec(i:Int, fact:Int):Int = {
  if(i <= 1)
    throw new Exception("check stack")
  else
    factorialTailRec(i -1, i * fact)
}

factorialTailRec(5, 1)




