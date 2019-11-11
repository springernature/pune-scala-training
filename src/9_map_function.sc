val a = List(1,2,3)

val op = a.map( x => x *2)
a.map( x => x.toString)
a.map( x => println(x))

val changedA = a ++ List(4)


val mutableA = scala.collection.mutable.MutableList(1,2,3)
mutableA.map(x => x * 2)

mutableA.+=(4)
println(mutableA)

def filterOdd(x:Int) = {
  (x % 2 != 0)
}

a.filter(x => (x % 2 != 0))
a.filter(x => (x % 2 == 0))
a.filter(filterOdd)

a.foreach(println(_))
a.filter(_ % 2 == 0)
a.map(_.toString)


val words = List("Piyush", "Chandra", "Deepak", "Ram")
words.map(entry => entry.size)
     .filter(e => e % 2 ==0)
     .sum








