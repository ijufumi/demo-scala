package jp.ijufumi.scala

import scala.io.Source

object Main extends App {
  val sources = Source.fromFile("src/main/resources/sample.json")

  sources.foreach(s => {
    s.toString match {
      case "{" | "}" => println
      case "[" | "]" => println
      case "\"" => println
      case ":" => println
      case "," => println
      case x : String => print(x.trim) // print key/value
    }
  })
  sources.close()
}
