/**
  * Created by randy on 12/13/18.
  */

object FizzBuzz extends App {
  def fizzBuzz(n: Int): List[String] = {
    (1 to n).toList.map(genString)
  }

  def genString(i: Int): String = {
    (i%3,i%5) match {
      case (0,0) => "FizzBuzz"
      case (0,x) => "Fizz"
      case (y,0) => "Buzz"
      case (x,y) => s"$i"
    }
  }

  println(fizzBuzz(15))
}
