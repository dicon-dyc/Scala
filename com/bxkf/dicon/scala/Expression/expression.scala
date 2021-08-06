package com.bxkf.dicon.scala.Expression

object expression {

  def main(args: Array[String]): Unit = {

    //表达式 y = x*2
    val nums = Seq(1,2,3)
    for (num <- nums) yield num*2
    nums.foreach(println)


    val Names = List("_adam","_david","_frank")
    val capNames = for (name <- Names) yield {

      //删除每个元素前的下划线
      val nameWithoutUnderscore = name.drop(1)

      //首字母大写
      val capName = nameWithoutUnderscore.capitalize
      capName
    }
    capNames.foreach(println);




  }

}
