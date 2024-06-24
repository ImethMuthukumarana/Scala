object act1{
    def main(args: Array[String]): Unit ={
        var k,i,j = 2
        var m,n = 5
        var f = 12.0f
        var g = 4.0f
        var c = 'X'

        val line1 = k+12*m
        val line2 = m/j
        val line3 = n%j
        val line4 = m/j*j
        val line5 = f+10*5+g
        i = i+1
        val line6 = i*n

        println(s"k+12*m = $line1")
        println(s"m/j = $line2")
        println(s"n%j = $line3")
        println(s"m/j*j = $line4")
        println(s"f+10*5+g = $line5")
        println(s"++i*n = $line6")
    }

}
