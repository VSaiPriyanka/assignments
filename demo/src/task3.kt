import java.util.Date

class Transaction(val amount: Double, val date: Date, val category: String) {
    // Additional methods and properties can be added here if needed
}
fun main() {
    val transaction = Transaction(100.0, Date(), "Groceries")

    println("Amount: ${transaction.amount}")
    println("Date: ${transaction.date}")
    println("Category: ${transaction.category}")
}