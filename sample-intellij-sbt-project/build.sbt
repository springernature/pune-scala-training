name := "sample-intellij-sbt-project"

version := "0.2"

scalaVersion := "2.12.10"

libraryDependencies ++= List(
  "com.typesafe.play" %% "play-ahc-ws-standalone" % "2.0.7",
  "org.apache.commons" % "commons-lang3" % "3.9",
  "com.marklogic" % "marklogic-xcc" % "8.0.9" from "http://developer.marklogic.com/maven2/com/marklogic/marklogic-xcc/8.0.9/marklogic-xcc-8.0.9.jar",
  "org.scalatest" % "scalatest_2.12" % "3.0.1" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test"
)


resolvers += "typesafe repo" at "https://dl.bintray.com/typesafe/ivy-releases/"



