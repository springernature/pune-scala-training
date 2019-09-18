class Person(val name:String, val age:Int) // only getter abd assigned at constrcutor
class PersonMutable(var name:String, var age:Int) // class defined will have getter and setter

val p1= new Person("raj", 30)
p1.name
p1.age


class Person3(val name:String="raj", val age:Int=30) // only getter abd assigned at constrcutor
val P2=new Person3()
P2.age
P2.name

val P3 = new Person3(name="Ram")
P3.name

class Person4 {
  def this(name:String, age:Int, address:String)= {
  this
  }
}

class Person5(val other:String){
  def this ( name:String, age:Int, address:String, other:String)= {
    this(other)
  }
}

val p5= new Person5("Ram", 23, "address 123", "other info")
p5.other
val p6 = new Person5("mmm")
p6.other

