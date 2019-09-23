val numbers = (1 to 10).toList
val slidenumbers = numbers.sliding(3)

println(slidenumbers.foreach(x =>println(x)))

val slidenumbersBy2 = numbers.sliding(3, 3)

println(slidenumbersBy2.foreach(x =>println(x)))



val numberto5 = (1 to 5).toList

numberto5.foldRight(1)( (i, fact) => fact*i )
numberto5.foldLeft(1)( (i, fact) => fact*i )

val numberStrings = (1 to 5).toList.map(x => x.toString)

val acc1 = numberStrings.foldRight("+")( (num, acc) => acc + "_" + num )
val acc2 = numberStrings.foldLeft("+")( (num, acc) => acc + "_" + num )

