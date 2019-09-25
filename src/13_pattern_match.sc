val const = "India"


class Address {
  private val city: String = "Pune"

}
object Address{
  new Address().city
}

//companion can access private members


case class Person(age: Int, name: String)

def derive(n : Any) = {

n match{
  case z: String if(z == "neha") => "hi neha"
  case name => "Hi "+ name
  case z: Int =>
  case z: String =>
  case name @ "neha" =>
  case `const` => const
  case _ => "Hi neha"
}

}

def matchTuple(name: String, age: Int) = {
  (name, age, ) match  {
    case (n, m) => //perform action
    case (_,_) =>

  }
}

def matchObjects(p: Person) = {
  p match  {
    case pp @ Person(20, "Abhi") => p.age ; pp.age
    case _ =>

  }
}

def matchList(p: List[Int]): List[Int] = {

  p match  {
    case list @ List(1, _*) => list
    case 1 :: 2 :: rest   => p  ::: List(2)
    case _ =>

  }
}


//matchTuple("name", 10)
//matchObjects(List(1,2))
//derive(const)
//derive(2)

