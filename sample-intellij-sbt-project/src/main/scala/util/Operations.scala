package util

import org.apache.commons.lang3.math.Fraction

class Operations(calculator: Calculator) {

  def add(a:Int, b:Int) = calculator.add(a,b)

  def sub(a:Int, b:Int) = a - b


  /*def usePlay = {
    val wsClient = StandaloneAhcWSClient()
    val user1Future = wsClient.url("https://reqres.in/api/users/1").get()
  }*/

  def useFraction = println(Fraction.ONE)

}
