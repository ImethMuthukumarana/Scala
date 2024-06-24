object act3{
    def normal(normal_hours: Int): Int = {
      val normalTot:Int = normal_hours*250
      return normalTot
    }
    
    def ot(ot_hours: Int): Int = {
      val otTot:Int = ot_hours*85
      return otTot
    }
    
    def totSalary(normal_hours:Int, ot_hours:Int): Int = {
      return normal(normal_hours) + ot(ot_hours)
    }
    
    def calcTax(normal_hours:Int, ot_hours:Int): Double = {
      val sal:Int = totSalary(normal_hours, ot_hours)
      val margin:Int = totSalary(40, 30)
      if(sal >= margin){
        return totSalary(normal_hours, ot_hours)*0.12
      }else{
        return 0
      }
    }
    
    def takeHomeSal(normal_hours:Int, ot_hours:Int):Double = {
       return totSalary(normal_hours, ot_hours) - calcTax(normal_hours, ot_hours)
    }
    
    def main(args: Array[String]): Unit = {
      val normal_hours = 40
      val ot_hours = 30
      println("Take Home Salary is - "+takeHomeSal(normal_hours, ot_hours))
    }
}
