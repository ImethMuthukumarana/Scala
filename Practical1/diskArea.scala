object Disk {
  def area(rad: Double): Double = math.Pi * rad * rad

  def main(args: Array[String]): Unit = {
    val rad = 5.0
    val ar = area(rad)
    println(s"Area of a disk is $ar")
  }
}
