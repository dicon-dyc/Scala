package com.bxkf.dicon.scala.ClassCreate

object ClassCreate {

  def main(args: Array[String]): Unit = {

    val one = new Person("Tom",20)
    one.eat()
    one.run()

  }

}

class Person(var name : String , var age : Int){

  override def toString: String = s"name is $name,age is $age"

  def eat() : Unit = println("eat quickly")
  def run() : Unit = println("run fast")
}

class People(var name : String , var age : Int = 20, var gender : String = "boy"){

  override def toString: String = s"name is $name, age is $age, a $gender"
}
