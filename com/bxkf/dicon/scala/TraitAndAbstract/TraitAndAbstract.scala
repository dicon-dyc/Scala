package com.bxkf.dicon.scala.TraitAndAbstract
import scala.io.StdIn.readLine


object TraitAndAbstract {

  def main(args: Array[String]): Unit = {

    val name = readLine()
    val dog = new Dog(name)
    dog.speak
    dog.comeToMaster()
  }

}
