import java.util.Date

class Person(val name:String, val age: Int)

val p1 = new Person("Piyush", 30)
p1.name
p1.age


class Article(val name:String, val pubDate: Date, val isPublished : Boolean) {

  def this(name:String, pubDate: Date) = {
    this(name, pubDate, false)
    println("aux constructor reached")
  }

}

val a = new Article("a", new Date())
val b = new Article("b", new Date(), true)