package com.bxkf.dicon.scala.Abstract

class Dog(name : String) extends Pet (name){

  override def speak(): Unit = println("Woof")
  override def comeToMaster(): Unit = println("Here i am")
}
