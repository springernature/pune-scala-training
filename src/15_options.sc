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




