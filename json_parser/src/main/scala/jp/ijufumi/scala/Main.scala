package jp.ijufumi.scala

import scala.io.Source

object Main extends App {
  val sources = Source.fromFile("src/main/resources/sample.json")
  sources.foreach(println)
  sources.close()
}
