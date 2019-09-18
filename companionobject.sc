class Vehicle(val tyres:Int,val seats:Int){
  def drive:Unit={
    println("drive")
  }
  def stop:Unit={
    println("stop")
  }
}

object Car{
  def drive:Unit={
    println("drive")
  }
  def stop:Unit={
    println("stop")
  }
}

Car.drive