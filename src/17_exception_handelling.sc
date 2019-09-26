import scala.util.{Failure, Success, Try}
//Exception handling with try expressions

//No Checked

//introduced Try (wrapped in Success, Failure)



def perform(n : Int): Try[Int] = {

  Try {
    n/0
  }
}


def again(n : Int) ={

  try{

    throw new RuntimeException("")
  }catch{

    case e: RuntimeException => "in run time exception"
    case e: Exception => "in exception"
  }
  finally {


  }
}

val mayBevalue: Try[Int] = perform (55)
val mayBeProcessedValue: Try[Int] = mayBevalue.map(succesValue => succesValue*succesValue)


perform (55) match {
  case Success(value) => value
  case Failure(exception) => println(exception.getMessage)
}


again(55)