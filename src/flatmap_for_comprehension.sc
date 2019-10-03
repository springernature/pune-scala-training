val numbers = (1 to 5).toList
val alphabets = List("a", "b", "c")

//map with map
val combinations = numbers.map(number =>
  alphabets.map(alpha => number + alpha)
)

combinations.flatten

//flatmap
numbers.flatMap(
  number => alphabets.map(alpha => number + alpha))


val output = for {
  number <- numbers
  alphabet <- alphabets
} yield {
  number + alphabet
}


numbers.map(number =>
  if(number % 2 == 0) Some(number)
  else None)


numbers.flatMap(number =>
       if(number % 2 == 0) Some(number)
       else None
)

val output2 = for {
  number <- numbers if(number % 2 == 0)
} yield {
  number
}


val doubleOption = Some(Some("name"))
doubleOption.flatMap(a => a.map(b=> b.length))

val doubleOption2:Option[Option[String]] = Some(None)
doubleOption2.flatMap(a => a.map(b=> b.length))


val optionalList:Option[List[String]] = Some(List("1", "2", "3"))
//optionalList.flatMap(list => list.map(value => value.toInt))
//this gives error, needs Option[_] as returnType for function.







