/**
  * Created by randy on 12/13/18.
  */

object JewelsAndStones extends App {
  def numJewelsInStones(j: String, s: String): Int = {
    val jewelMap = j.map(ch => (ch,1)).toMap

    val stoneMap = s.map(stone => jewelMap.getOrElse(stone, 0))

    val stoneSum = stoneMap.sum

    stoneSum
  }

  //Input: J = "aA", S = "aAAbbbb"
  //Output: 3

  val input1j = "aA"
  val input1s = "aAAbbbb"

  val out1 = numJewelsInStones(input1j, input1s)
  println(s"Ex1: $out1")

  //Example 2:

  //Input: J = "z", S = "ZZ"
  //Output: 0

  val input2j = "z"
  val input2s = "ZZ"

  val out2 = numJewelsInStones(input2j, input2s)
  println(s"Ex2: $out2")
}
