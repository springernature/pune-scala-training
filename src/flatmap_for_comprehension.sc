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


numbers.map(number =>
  if(number % 2 == 0) Some(number)
  else None)
       .flatten

numbers.flatMap(number =>
       if(number % 2 == 0) Some(number)
       else None
)








