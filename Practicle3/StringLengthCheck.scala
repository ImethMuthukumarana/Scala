object StringLengthCheck {
  def checkString(strlist: List[String]): List[String] = {
    strlist.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val input = List("Kasun", "Tharindu", "Imeth", "Hansaja", "Nadun")
    val output = checkString(input)
    println(output)
  }
}

