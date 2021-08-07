package com.bxkf.dicon.scala.Abstract
import scala.io.StdIn.readLine

object Abstract {
  def main(args: Array[String]): Unit = {

    val name = readLine()
    val dog = new Dog(name)
    dog.speak()
    dog.comeToMaster()
  }

}
