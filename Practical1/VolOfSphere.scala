object Vol {
  def volume(rad: Double): Double = 4.0 / 3.0 * math.Pi * rad * rad * rad

  def main(args: Array[String]): Unit = {
    val rad = 8.0
    val vol = volume(rad)
    println(s"Volume of a sphere is $vol")
  }
}
