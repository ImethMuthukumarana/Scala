object Run {
  def easyPace(distance: Int): Int = distance * 8
  def tempo(distance: Int): Int = distance * 7

  def main(args: Array[String]): Unit = {
    val totTime = easyPace(2) + tempo(3) + easyPace(2)
    println(s"Total time is $totTime")
  }
}
