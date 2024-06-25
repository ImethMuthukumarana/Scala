def NoOfattendees (ticket_price: Int): Int= 120 + (15 - ticket_price) / 5 * 20;
def revenue (ticket_price: Int): Int = attendees (ticket_price) * ticket_price;
def cost (ticket_price: Int): Int = 500 + attendees(ticket_price)*3;
def profit (ticket_price: Int): Int = revenue(ticket_price) - cost(ticket_price);

@main def main4(): Unit = {
    println(s"Profit for ticket price 15: ${profit(15)}")
    println(s"Profit for ticket price 20: ${profit(20)}")
    println(s"Profit for ticket price 25: ${profit(25)}")
    println(s"Profit for ticket price 30: ${profit(30)}")
    println(s"Profit for ticket price 35: ${profit(35)}")
    println(s"Profit for ticket price 40: ${profit(40)}")
}
