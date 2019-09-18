def factorialRec(i:Int,fact:Int):Int={

  if(i<=1)

    fact
  else
    factorialRec(i-1,i*fact)
}

factorialRec(6,fact=1)