//list is immutable

val a = List(1,2,3)

val another = 1::List(2,3)

a.head // only one element
a.tail // one or more element

val more = 1::(2::(3::Nil))

a.init //all elements except last
a.last //last element

a.reverse // will give new list for each operation

val b=Map("1"->"Raj", "2"->"Jon", "3"->"Team")

a.map(x=>x*2)


//Map is a function gives option to take element do processing and return back changed values
a.map(x=>println(x)) //this will print list elements but nothing is return so will save Unit in all ()

//Map function is example of box pattern

//we can get mutable and immutable version of collections from mutable and immutable package
// for list we have MutableList class which exception as compare to other collections

var mutableA = scala.collection.mutable.MutableList(1, 2, 4)
mutableA.map(x=>x*3)

mutableA+=4

a.filter(x=>x%2!=0)

val numbers=(1 to 10).toList //list 1 to 10, sliding used to slid by by given number example below will slide by 3

numbers.sliding(3).foreach(x=>println(x))

// tail recursion is an example of fold function also 











