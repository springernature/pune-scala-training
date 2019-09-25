/*

apply
unapply
extractor

*/


case object A

case class User(username: String, password: String)


object User {
  def apply(username: String, password: String): String = username +"@"+ password
  def unapply(userString: String): Option[(String, String)] = {
    val parts = userString split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}


val z = User("neha", "pune")


User.apply("admin", "password")
User.unapply(z)


