package com.bxkf.dicon.scala.mergeString

object mergeString {

  def main(args : Array[String]) : Unit = {

    val first_name = "Alan"
    val last_name = "Smith"
    val tmp = " "
    println(first_name + tmp + last_name)
    println(s"$first_name$tmp$last_name")
  }
}
