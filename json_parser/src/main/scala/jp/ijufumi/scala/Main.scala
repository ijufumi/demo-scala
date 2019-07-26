package jp.ijufumi.scala

import scala.io.Source

object Main extends App {
  val sources = Source.fromFile("src/main/resources/sample.json")

  val checkComma = "(,)".r
  val checkCologne = "(:)".r
  val checkQuotation = "(\")".r
  val checkStartBracket1 = "(\\{)".r
  val checkEndBracket1 = "(\\})".r
  val checkStartBracket2 = "(\\[)".r
  val checkEndBracket2 = "(\\])".r

  sources.foreach(s => {
    s.toString match {
      case checkStartBracket1(_) | checkStartBracket2(_) => print(_)
      case checkEndBracket1(_) | checkEndBracket2(_)=> println
      case checkQuotation(_) => print(_)
      case checkCologne(x) => print(x)
      case checkComma(_) => println
      case x => print(x.trim) // print key/value
    }
  })
  sources.close()
}
