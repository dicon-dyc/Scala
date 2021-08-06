package com.bxkf.dicon.scala.helloyou

/**
 * author：dicon
 * date：2021-7-31 15:02
 */

object helloyou extends App {

  //不使用命令行参数编译输出Hello,You！
  if (args.size == 0){
    println("Hello,You!")
  }


  //使用命令行参数编译输出Hello，参数
  else {
    println("Hello," + args(0))
  }
}
