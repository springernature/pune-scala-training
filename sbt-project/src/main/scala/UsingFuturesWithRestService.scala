import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import play.api.libs.ws.DefaultBodyReadables._
import play.api.libs.ws._
import play.api.libs.ws.ahc._

import scala.concurrent.ExecutionContext.Implicits._
import scala.concurrent.Future

object UsingFuturesWithRestService {

  def call(wsClient: StandaloneWSClient): Future[Unit] = {
    val user1Future: Future[StandaloneWSRequest#Response] =
      wsClient.url("https://reqres.in/api/users/1").get()
    val user2Future: Future[StandaloneWSRequest#Response] =
      wsClient.url("https://reqres.in/api/users/2").get()
    val user3Future: Future[StandaloneWSRequest#Response] =
      wsClient.url("https://reqres.in/api/users/3").get()

    user2Future.map { user2 =>
      println(s"user 1  ======  ${user2.body[String]}")
    }

//    user1Future.map { user1 =>
//      user2Future.map { user2 =>
//        user3Future.map { user3 =>
//          println(s"user 1 = ${user1.body[String]}")
//          println(s"user 2 = ${user2.body[String]}")
//          println(s"user 3 = ${user3.body[String]}")
//
//          val userList = s"${user2.body[String]} \n ${user1.body[String]} \n ${user3.body[String]}"
//          println(s"user List : - \n $userList")
//        }
//      }
//    }


    for {
      user1 <- user1Future
      user2 <- user2Future
      user3 <- user3Future
    } yield {
      println(s"user 1 = ${user1.body[String]}")
      println(s"user 2 = ${user2.body[String]}")
      println(s"user 3 = ${user3.body[String]}")

      val userList = s"${user2.body[String]} \n ${user1.body[String]} \n ${user3.body[String]}"
      println(s"user List : - \n $userList")
    }
  }

  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem()
    system.registerOnTermination {
      System.exit(0)
    }

    implicit val materializer = ActorMaterializer()
    val wsClient = StandaloneAhcWSClient()

    call(wsClient)
      .andThen { case _ => wsClient.close() }
      .andThen { case _ => system.terminate() }
  }

}
