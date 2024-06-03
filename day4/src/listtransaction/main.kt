package listtransaction

fun main() {
    val transactions = listOf(
        Transaction(100.0, TransactionType.INCOME),
        Transaction(50.0, TransactionType.EXPENSE),
        Transaction(200.0, TransactionType.INCOME),
        Transaction(75.0, TransactionType.EXPENSE)
    )

    println("Total Incomes: ${transactions.totalIncomes()}")
    println("Total Expenses: ${transactions.totalExpenses()}")
}