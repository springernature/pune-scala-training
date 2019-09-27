import scala.concurrent.{Await, ExecutionContextExecutor, Future}
import scala.util.{Failure, Success}
import scala.concurrent.duration._
import scala.language.postfixOps

def getMeYFromRemoteServer(x: Int) = x + 1

implicit val ec: ExecutionContextExecutor = scala.concurrent.ExecutionContext.global

println("Start")

val a: Future[Int] = Future {
  val x = 1
  val y = getMeYFromRemoteServer(x)
  Thread.sleep(2000)
  y
}

/* Using 'var' is not recommended in Scala
   just to get an understanding about whats happening around the Future handling, 'var' is used here. */
var b = 0


//a.onComplete {
//  case Success(value) => b = value; println("b = " + value + " in success")
//  case Failure(exception) => println("Exception " + exception)
//}

a.map( value => {
  b = value
  println("b = " + b + " - after success")
})

println("b = " + b )

Await.result(a, 3 seconds)

println("b = " + b + " at the end of the program")
println("a = " + a)
