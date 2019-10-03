sealed trait Vehicle

class Car extends Vehicle
object Maruti extends Vehicle



sealed trait Datasource
object Lb extends Datasource
object Tpp extends Datasource
object Interactive extends Datasource


// use like enums
def handleDataSource(ds:Datasource) = {
  ds match {
    case Lb => "Landolt Bonstein"
    case Tpp => "Thermophysical props"
    case Interactive => "Springer Materials Interactive"
    case _ => "Invalid"
  }
}


