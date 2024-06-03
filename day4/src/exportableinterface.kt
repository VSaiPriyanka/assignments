interface Exportable {
    fun exportToCsv(): String
}

data class Transaction(
    val id: Int,
    val date: String,
    val amount: Double,
    val description: String
) : Exportable {
    override fun exportToCsv(): String {
        // Convert the transaction data to a CSV format
        return "$id,$date,$amount,\"$description\""
    }
}

fun exportTransactionsToCsv(transactions: List<Transaction>): String {
    val header = "ID,Date,Amount,Description"
    val csvData = transactions.joinToString("\n") { it.exportToCsv() }
    return "$header\n$csvData"
}

fun main() {
    val transactions = listOf(
        Transaction(1, "2024-05-20", 150.0, "Grocery shopping"),
        Transaction(2, "2024-05-21", 200.0, "Electronics purchase"),
        Transaction(3, "2024-05-22", 50.0, "Bookstore")
    )
    val csvData = exportTransactionsToCsv(transactions)
    println(csvData)
}