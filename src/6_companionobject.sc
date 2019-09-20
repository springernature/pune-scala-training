class Vehicle(val tyres: Int, val seats: Int) {

  def drive = {
    println("drive")
  }

  def stop = {
    println("stop")
  }

}

object Vehicle {
  def apply(tyres: Int, seats: Int) = {
    println("in apply")
    new Vehicle(tyres, seats)
  }
}

val v1 = Vehicle.apply(2, 2)
val v2 = Vehicle(4, 4)

v1.drive
v2.seats



/*object Car {

  def drive = {
    println("drive")
  }

  def stop = {
    println("stop")
  }

}

Car.drive
Car.stop

*/


