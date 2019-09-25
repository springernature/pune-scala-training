//companion is singleton and able to access private methods and variables as well of companion class but same is not true
// in non companion case

//pattern matching is similar to switch
//in this no break or continue exsists ... it will automatically break if matched
val cont="India"
def derive(in:Any):Any={
  in match {
    case cont=>cont // constant to match
    case "raj"=>"Raj matched"
    case z:String if(z=="raj")=>"Specic case if in else will go next..z is place holder"
    case _ => "nothing matched"
  }
}

derive("raj")
derive(2)
derive()
derive(cont)

def matchTuple(name:String, age:Int): String ={

  (name, age) match {
    case (n,m)=> n+m
    case (_,_)=> "wild match"

  }
}

matchTuple("10", 20)


// match objects etc
case class Person(name:String, age:Int)
 def objMatch(p:Person): Any = {

   p match {
     case p @ Person("ram", 20)=>"Ram specific person matched"
     case _=>"wild case"
   }

 }

def listMatch(p:Any):Any={
  case list @ List(1,2,3)=>"Matched 1,2,3"
  case list @ List(1, _)=>"Matched 2 only arg"
  case list @ List(1, _*)=>"2nd arg can be as many as possible"
  case 1::rest=>"macthed first number and rest anything"
  case _=>"anything matched"
}

listMatch(List(1,2,3))

println(objMatch(new Person("ram", 20)).toString)

//sealed classes or traits ..it will give warning if missed any implimentation at compile time
//it cant be extended in diff files as well but can be used

sealed trait Personn {
 val age:Int
}

case class Student(name:String, age:Int) extends Personn

//option
val option1: Option[String] = Some("123")
val option2: Option[String] = None


option1.get // it will match and then will show
option1.getOrElse("23")

// double colon ::  concats element and list and ::: will append 2 lists
//

// Try will throw success and failure

def perform(in:Int):scala.util.Try[Int]={
  scala.util.Try{
    in/0
  }
}

perform (20) match {
  case scala.util.Success(value) =>"Here"
  case scala.util.Failure(value)=>"Failed"

}

//in catch we can have cases for exception and handle

def error(in:Int): Unit = {
  try {
    throw new Exception("error")

  } catch {
    case e:Exception=>"General exception"
    case e:RuntimeException=>"Runtime exception"
  } finally{

  }
}


// apply will construct and unapply will break and give back things in class/object
case class User(userName:String)

object User {
  
  def apply(userName:String)="hello"

  def unapply(arg: User): Option[String] = ???
}

