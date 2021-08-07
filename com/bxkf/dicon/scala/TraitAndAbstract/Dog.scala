package com.bxkf.dicon.scala.TraitAndAbstract

class Dog(var name : String) extends Pet {
  override def comeToMaster(): Unit = println(s"Woo-hoo,$name is coming!")

  override def speak: Unit = println("meow")
}


