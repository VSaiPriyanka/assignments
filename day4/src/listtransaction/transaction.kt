package listtransaction

data class Transaction(val amount: Double, val type: TransactionType)

enum class TransactionType {
    INCOME,
    EXPENSE
}

fun List<Transaction>.totalExpenses(): Double {
    return this.filter { it.type == TransactionType.EXPENSE }
        .sumOf { it.amount }
}

fun List<Transaction>.totalIncomes(): Double {
    return this.filter { it.type == TransactionType.INCOME }
        .sumOf { it.amount }
}