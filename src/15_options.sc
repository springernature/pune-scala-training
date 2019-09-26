/* Option
  need
  Some, None
  Match
  get, getOrElse

*/


val optional1: Option[String] = Some("23")
val optional2 : Option[String] = None

def print() = {
  optional2 match {

    case Some(p) => p
    case None => "nothing"

  }
}


def zz =
  if(optional1.isDefined) 333
else 4444


zz
print


def getRandomEvenNumber = {
  val num = (Math.random() * 10).toInt
  if(num % 2 ==0 ) Some(num)
  else None
}

val mayBeName:Option[String] = Some("Piyush")
val mayBeNumber = getRandomEvenNumber

/*handling option by pattern match*/
mayBeNumber match {
  case Some(value) => Some(value * value)
  case None => { println("not found")
    None
  }
}

/* direct handling, None is directly returned*/
val maybeOutput: Option[Int] = mayBeNumber.map(value => value * value)

mayBeNumber.filter(number => number > 5)



