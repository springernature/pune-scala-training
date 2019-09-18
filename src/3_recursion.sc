var result=1
def mutiply(n:Int): Int = {

  if (n > 1) {
    result * mutiply(n - 1)

  } else {
     throw new Exception("Error")
  }
}

println(mutiply(5))
//@tailrec - it will check if it is tail rec or not, and if it is not correct it will show error
def factorialTailRec(i:Int, fact:Int):Int={
  if(i<=1)
    throw new Exception("Error")
  else
    factorialTailRec(i-1, i*fact)
}
factorialTailRec(5, 1)