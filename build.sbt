ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "training_scala"
  )
// The Typesafe repository
resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1",
  "org.scalatest" %% "scalatest" % "3.2.11" % "test",
  "com.typesafe.play" %% "play-json" % "2.9.2"
)

//initialCommands / console := "import com.pulse0930.scalatrain._; import scala.util.control._"

//initialCommands / (Test, console) := (initialCommands / console).value + ",TestData._"