val pair=("Raj", 12)
val pair2=("Raj", 12, 24.8)
val pair3=("Raj", 12, true) // tuple is utility class Product is class, limit is 22 element but we can extend product and have more element

pair._1
pair._2

var list = (1 to 10).toList
list.slice(0,5)
val list2=list.partition(x=>x%2==1) // it partions the list in two one which fulfills criteri and another which does not
list2._1
list2._2

val (odd,even) = list.partition(x=>x%2==1) // we saved both list in two odd ecen variable
odd
even

// use _ if dont know type or it can take what ever type
list.filter(_%2==0)

// for and yield : new way of writting map function  using for and yield

val result =
for {
  number<-list
}yield {
  number*10
}

val listAlp=List("a", "b")

val mix = list.map(x=>listAlp.map(y=>x+y)) // will give two dmensional lists, mutiple lists
mix.flatten // it makes one list not mutiple

for { // in this we get flat list and not mutiple
  number<-list
  alp<-listAlp
} yield {
  number+alp
}


