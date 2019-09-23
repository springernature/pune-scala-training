val pairExample: (String, Int) = ("1", 2)
val tripleExample: (String, Int, Boolean) = ("1", 2, true)
val tuple4Example: (String, Int, Boolean, Double) = ("1", 2, true, 2.2)

pairExample._1
pairExample._2


def getPair() = ("1", 2)


val numberto5 = (1 to 5).toList
val oddEven = numberto5.partition( x => x % 2 == 1)
oddEven._1
oddEven._2

val (odd, even) = numberto5.partition( x => x % 2 == 1)
odd
even