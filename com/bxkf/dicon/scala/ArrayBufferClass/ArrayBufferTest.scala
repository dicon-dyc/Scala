package com.bxkf.dicon.scala.ArrayBufferClass
import scala.collection.mutable.ArrayBuffer

object ArrayBufferTest {

  def main(args : Array[String]) : Unit = {

    val ints = ArrayBuffer[Int]()
    val names = ArrayBuffer[String]()

    val a = ArrayBuffer(1, 2, 3)         // ArrayBuffer(1, 2, 3)
    a.append(4)                          // ArrayBuffer(1, 2, 3, 4)
    a.append(5, 6)                       // ArrayBuffer(1, 2, 3, 4, 5, 6)
    a.appendAll(Seq(7,8))                // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)
    a.clear                              // ArrayBuffer()

    val b = ArrayBuffer(9, 10)           // ArrayBuffer(9, 10)
    b.insert(0, 8)                       // ArrayBuffer(8, 9, 10)
    b.insertAll(0, Vector(4, 5, 6, 7))   // ArrayBuffer(4, 5, 6, 7, 8, 9, 10)
    b.prepend(3)                         // ArrayBuffer(3, 4, 5, 6, 7, 8, 9, 10)
    b.prepend(1, 2)                      // ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    b.prependAll(Array(0))               // ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val c = ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
    c.remove(0)                          // ArrayBuffer(b, c, d, e, f, g)
    c.remove(2, 3)                       // ArrayBuffer(b, c, g)

    val d = ArrayBuffer.range('a', 'h')  // ArrayBuffer(a, b, c, d, e, f, g)
    d.trimStart(2)                       // ArrayBuffer(c, d, e, f, g)
    d.trimEnd(2)                         // ArrayBuffer(c, d, e)

  }

}
