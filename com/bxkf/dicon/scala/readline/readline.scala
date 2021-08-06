package com.bxkf.dicon.scala.readline

import scala.io.StdIn.readLine

object readline {

  def main(args: Array[String]): Unit = {

    print("Enter your first name:")
    val firstname = readLine()

    print("Enter your last name:")
    val lastname = readLine()

    println(s"Your name is $firstname $lastname")

  }
}
