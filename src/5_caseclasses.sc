case class Car(tyres:Int, seats:Int)

val c1 = Car(4,5)
val c2 = Car(6,5)

c1.seats
c2.seats

object CarOrdering extends Ordering[Car] {
  override def compare(x: Car, y: Car) = {
    if(x.seats > y.seats || x.tyres > y.tyres) 1
    else -1
  }
}

List(c2, c1).sorted(CarOrdering)




