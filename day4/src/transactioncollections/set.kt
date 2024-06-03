package transactioncollections

fun addTransactionToSet(transactions: MutableSet<Transaction>, transaction: Transaction) {
    transactions.add(transaction)
}

fun removeTransactionFromSet(transactions: MutableSet<Transaction>, transaction: Transaction) {
    transactions.remove(transaction)
}

fun findTransactionInSet(transactions: Set<Transaction>, id: String): Transaction? {
    return transactions.find { it.id == id }
}

fun printTransactionsSet(transactions: Set<Transaction>) {
    transactions.forEach { println(it) }
}