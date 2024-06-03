import java.util.Date

class Transaction4(val amount: Double, val date: Date, val category: String)

fun categorizeTransaction(transaction: Transaction) {
    val category = when (transaction.category) {
        "Food" -> "Food"
        "Utilities", "Bills" -> "Utilities"
        "Entertainment" -> "Entertainment"
        else -> "Other"
    }

    println("Amount: ${transaction.amount}, Date: ${transaction.date}, Category: $category")
}

fun main() {
    val transaction1 = Transaction(100.0, Date(), "Food")
    val transaction2 = Transaction(50.0, Date(), "Bills")
    val transaction3 = Transaction(200.0, Date(), "Entertainment")
    val transaction4 = Transaction(75.0, Date(), "Shopping")

    categorizeTransaction(transaction1)
    categorizeTransaction(transaction2)
    categorizeTransaction(transaction3)
    categorizeTransaction(transaction4)
}