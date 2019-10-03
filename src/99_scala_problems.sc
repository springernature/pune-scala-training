//recurse nth element of a list

// 1 find last element in list
val aList=List(1,2,3,4,5,5,4,3,2,1)
aList.last

//2 2nd last
aList.slice(aList.length-2, aList.length-1).head

//nth element, passed number
aList.slice(5-1, 5).head

// 4 no of element in list
aList.length

// 5 reverse the list
aList.reverse

//6 palindrome, it needs to traverse half of list at least+reverse OR can complete list be reversed and matched
var lenght=0
lenght=aList.length/2
if(aList.length%2 ==0){
  val lista=aList.slice(0, lenght)
  val listb=aList.slice(lenght, aList.length)
  println(lista==listb.reverse)
} else{
  val lista=aList.slice(0, lenght+1)
  val listb=aList.slice(lenght, aList.length)
  println(lista==listb.reverse)
}

var x:Int=0
println("hello...")
val list=List(1,23,45,-10)
list.map(value=>{
  x=value
  println(value)
})

val y:Int=1000

var list1=
for{
  x<-list
}yield {
  x+y
}

val list2=list1.map(
  value=>{
    value+1000
  }
)

val listx = List(1, 20, "Ram", 200)
list1.map(
  value=> {
    case 20=>value+10
    case "Ram"=>value+" hello "
    case _=>"no match"
  }
)







