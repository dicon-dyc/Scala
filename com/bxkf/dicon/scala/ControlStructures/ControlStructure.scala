package com.bxkf.dicon.scala.ControlStructures

object ControlStructure {

  def main(args: Array[String]): Unit = {

    val a = 10
    val b = 10
    if (a == b){
      doSomething()
    }else{
      doSomethingElse()
    }


  }

  def doSomething(): Unit ={
    println("good")
  }

  def doSomethingElse(): Unit ={
    println("not bad")
  }

}
