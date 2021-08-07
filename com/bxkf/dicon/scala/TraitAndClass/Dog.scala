package com.bxkf.dicon.scala.TraitAndClass

class Dog(var name: String) extends Speaker with TailWagger with Runner {


  //重写speak、statTail、stopTail、startRunning、stopRunning方法
  override def speak(): Unit = println("woof!")
  override def startTail(): Unit = println(s"$name is wagging tail")
  override def stopTail(): Unit = println("tail is stopped")
  override def startRunning(): Unit = println(s"$name is running")
  override def stopRunning(): Unit = println("Stopped running")
}