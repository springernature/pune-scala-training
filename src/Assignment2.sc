import scala.annotation.tailrec
//Recursion to revers string
def reverseRecur(input: String): String = {
  if (input.length == 0) {
    return input
  } else {
    //input=input.charAt(length-1)+input
    input.charAt(input.length-1)+reverseRecur(input.slice(0,input.length-1))
  }
}

println(reverseRecur("DIWALI"))
println(reverseRecur("HOLIHAI"))

//Tail recursion to reverse string
def reverseRecurTailFun(str: String):String = {
 @tailrec def reverseRecurTail(input: String, totallength:Int): String =
  {
    //println(input+totallength)
    if (totallength <=0) {
      input
    } else {
      reverseRecurTail(input.slice(0, totallength-1)+input.slice(totallength,input.length)+input.charAt(totallength-1), totallength-1)
    }

  }
reverseRecurTail(str, str.length)
}

reverseRecurTailFun("GODR")
reverseRecurTailFun("GODISGREAT")


//Loop to reverse string
def reverseString(input:String):String={
  var result=""
  for(i:Int<- 1 to input.length){
    result=result+input.charAt(input.length-i).toString
   // println(result)
  }

  result
}


//
trait Beverage {
  val defaultPrice:Int
  val defaultQty:Int
  var sugarQty: Int
  var milkQty:Int
  def addSugar(qty:Int): Unit ={
    this.sugarQty+=qty
  }
  def addMilkQty(qty :Int): Unit = {
    this.milkQty+= qty
  }

}

class Coffee(defaultPricee:Int, defaultQtyy:Int,milkQtyy: Int, sugarQtyy:Int) extends Beverage{
  override val defaultPrice = defaultPricee
  override val defaultQty = defaultQtyy
  override var sugarQty = sugarQtyy
  override var milkQty = milkQtyy
  def giveMeCoffee: Unit ={
    println("coffee served with = price "+defaultPrice+" qty in ml "+defaultQty +" sugar "+sugarQty+" milk "+milkQty)
  }
}

class Tea(defaultPricee:Int, defaultQtyy:Int,milkQtyy: Int, sugarQtyy:Int) extends Beverage{
  override val defaultPrice = defaultPricee
  override val defaultQty = defaultQtyy
  override var sugarQty = sugarQtyy
  override var milkQty = milkQtyy
  def giveMeTea: Unit ={
    println("Tea served with = price "+defaultPrice+" qty in ml "+defaultQty +" sugar "+sugarQty+" milk "+milkQty)
  }
}

//Use of above class

var coffee = new Coffee(10, 200, 50, 50) //coffee with default values
coffee.addMilkQty(10)
coffee.addSugar(15)
coffee.giveMeCoffee

println("milk="+coffee.milkQty+"price="+coffee.defaultPrice)
