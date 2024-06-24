object BPrice {
  def tot(n: Int): Double = n * 24.95
  def disc(tot: Double): Double = tot * 0.4
  def shipping(n: Int): Double = if (n > 50) 50 * 3 + (n - 50) * 0.75 else n * 3
  def cost(n: Int): Double = tot(n) - disc(tot(n)) + shipping(n)

  def main(args: Array[String]): Unit = {
    val bookC = 60
    val finalCost = cost(bookC)
    println(s"Final cost for books is $finalCost")
  }
}
