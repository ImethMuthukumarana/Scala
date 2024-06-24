object act4{
  def expectAttend(ticket_Price: Int): Int = ticket_Price match {
    case 15 => 120
    case _ if ticket_Price < 15 => 120 + (15 - ticket_Price) / 5 * 20
    case _ if ticket_Price > 15 => 120 - (ticket_Price - 15) / 5 * 20
  }

  def totalCost(total_Attendees: Int): Int = {
    500 + 3 * total_Attendees
  }

  def profit(ticket_Price: Int): Int = {
    ticket_Price * expectAttend(ticket_Price) - totalCost(expectAttend(ticket_Price))
  }

  def maxPrice(ticket_Price: Int): Int = {
    val currentProfit = profit(ticket_Price)
    val IncreasedProfit = profit(ticket_Price + 5)
    val DecreasedProfit = profit(ticket_Price - 5)

    (currentProfit, IncreasedProfit, DecreasedProfit) match {
      case (cp, ip, dp) if cp > ip && cp > dp => ticket_Price
      case (cp, ip, dp) if ip > cp && ip > dp => maxPrice(ticket_Price + 5)
      case (cp, ip, dp) if dp > cp && dp > ip => maxPrice(ticket_Price - 5)
    }
  }

  def main(args: Array[String]): Unit = {
    println(s"Best ticket price is ${maxPrice(15)}")
  }
}
