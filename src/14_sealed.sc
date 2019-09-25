/*

The sealedkeyword, therefore, is often a license to safe pattern match

Scala warnings,
Compiler benefits
Acts as Enum

*/


sealed trait Person {
  val age: Int
  val name: String
}

case class Student(age: Int, name: String) extends Person
case class Employee(age: Int, name: String) extends Person
case class UnEmployed(age: Int, name: String) extends Person

def describe(p: Person): String = p match {
  case Student(_,_) => "a student"
  case Employee(_,_) => "a employee"
  //case (_,_) => "a employee"
}


describe(Student(23,"Neha"))
describe(Employee(23,"Neha"))



//Enums
sealed trait A
case object B extends A
case object C extends A



def describeIt(p: A): String = p match {
  case B =>
  case C =>
}