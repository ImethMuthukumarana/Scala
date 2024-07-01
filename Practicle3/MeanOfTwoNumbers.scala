object MeanOfTwoNumbers {
  def mean(num1: Int, num2: Int): Double = {
    val avg = (num1 + num2) / 2.0
    BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 17
    val num2 = 11
    val result = mean(num1, num2)
    println(result)
  }
}
