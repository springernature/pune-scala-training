val numbers = (1 to 5).toList
val alphabets = List("a", "b", "c")

numbers.map( _ * 10)



val changedNumbers =
for {
  number <- numbers
}yield {
  number * 10
}

val mixers = numbers.map(num => alphabets.map(a => num + a))
mixers.flatten

for {
  number <- numbers
  alphabet <- alphabets
}yield {
  number + alphabet
}




