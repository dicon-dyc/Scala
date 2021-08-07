package com.bxkf.dicon.scala.TraitAndClass
import scala.io.StdIn.readLine

object TraitAndClass {

  def main(args: Array[String]): Unit = {

    var name: String = readLine()
    var dogone = new Dog(name)
    dogone.speak()
    dogone.startTail()
  }

}
