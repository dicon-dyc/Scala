package com.bxkf.dicon.scala.multipleLinesString

object multipleLinesString {

  def main(args: Array[String]): Unit = {

    val speech =
      """Four score and
        |seven years ago
        |our fathers ...
        |""".stripMargin
    println(speech)
  }
}
