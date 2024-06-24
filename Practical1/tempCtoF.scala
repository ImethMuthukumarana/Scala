object Temp {
  def tempr(c: Double): Double = c * 1.8 + 32

  def main(args: Array[String]): Unit = {
    val celc = 35.0
    val faren = tempr(celc)
    println(s"$celc C = $faren F")
  }
}
