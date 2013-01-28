package helloworld

/**
 * Created with IntelliJ IDEA.
 * User: tone81
 * Date: 1/27/13
 * Time: 7:39 PM
 * To change this template use File | Settings | File Templates.
 */
object HelloWorld {
  def main(args: Array[String]) {
    val result = getValue()
    getValue().foreach(outputStuff)
  }

  private def getValue(): Array[Int] = {
    val result: Array[Int] = new Array[Int](2)
    result(1) = 42
    result
  }

  private def outputStuff(value: Int) = {
    println(value)
  }
}
