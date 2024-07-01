object Reversestr{
def reverse(text: String): String = {
  if (text.isEmpty){
     return ""
  } 
  else{
     return reverse(text.tail) + text.head
  } 
}
def main(args: Array[String]): Unit = {
  val input = "Imeth"
  val output = reverse(input)
  println(output)
}
}
