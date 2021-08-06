package com.bxkf.dicon.scala.forround

object forround {

  def main(args: Array[String]): Unit = {

    //迭代集合中的元素
    val nums = Seq(1,2,3)
    for (n <- nums) println(n)

    //遍历字符列表
    val peoples = List(
      "Bill"
      ,"Tom"
      ,"Jack"
    )
    for (name <- peoples) println(name)

    //foreach方法
    peoples.foreach(println)

    //for和foreach搭配map
    val ratings = Map(
      "Lady in the Water" -> 3.0
      ,"Snakes on a Plane" -> 4.0
      ,"You,Me and Dupree" -> 3.5
    )
    for ((name,rating) <- ratings){
      println(s"$name $rating")
    }

    //case
    ratings.foreach{
      case(movie,rating) => println(s"key:$movie,value:$rating")
    }
  }

}
