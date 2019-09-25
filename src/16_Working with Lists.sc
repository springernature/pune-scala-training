



val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))

def concat(list: List[String]): String = list match {
  case list =>  (list ::: List("mango") ).mkString(" ")
  case "1" :: rest => 1 + " " + concat(rest)
  case  head :: tail => "others"
  case Nil => "empty"
}


concat(fruit)

fruit.init

concat(List())
concat(List("2" ,"3"))

/*
Working with List: :: (cons) and Nill
Head
Tail
isEmpty
::: concatenating

Head
Tail
isEmpty
::: concatenating
init
last
reverse
zipWithIndex
mkString

pno: 360
*/



