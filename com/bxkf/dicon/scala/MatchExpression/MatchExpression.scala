package com.bxkf.dicon.scala.MatchExpression

object MatchExpression {

  def main(args: Array[String]): Unit = {

    for (i <- 1 to  12){
      val monthName = i match {
        case 1  => "January"
        case 2  => "February"
        case 3  => "March"
        case 4  => "April"
        case 5  => "May"
        case 6  => "June"
        case 7  => "July"
        case 8  => "August"
        case 9  => "September"
        case 10 => "October"
        case 11 => "November"
        case 12 => "December"
        case _  => "Invalid month"
      }
      println(monthName)
    }
  }

}
