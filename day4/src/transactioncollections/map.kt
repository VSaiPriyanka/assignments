package transactioncollections

fun addTransactionToMap(transactions: MutableMap<String, Transaction>, transaction: Transaction) {
    transactions[transaction.id] = transaction
}

fun removeTransactionFromMap(transactions: MutableMap<String, Transaction>, id: String) {
    transactions.remove(id)
}

fun findTransactionInMap(transactions: Map<String, Transaction>, id: String): Transaction? {
    return transactions[id]
}

fun printTransactionsMap(transactions: Map<String, Transaction>) {
    transactions.values.forEach { println(it) }
}