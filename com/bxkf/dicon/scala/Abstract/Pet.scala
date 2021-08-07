package com.bxkf.dicon.scala.Abstract

abstract class Pet(name : String) {

  def speak() : Unit = println("Yo")
  def comeToMaster() : Unit
}
