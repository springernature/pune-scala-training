class Vehicle(val tyres: Int){

  def showTyre: Unit ={
    println("tyre")
  }
}
object Vehicle{
  def apply(tyres: Int): Vehicle = new Vehicle(tyres)
  def main(args: Array[String]): Unit = {
    println("Singleton companion object")
    println(new Vehicle(23).tyres)

  }
}

//val v=Vehicle.apply(23)

