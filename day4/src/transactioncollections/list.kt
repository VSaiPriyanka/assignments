package transactioncollections

fun addTransactionToList(transactions: MutableList<Transaction>, transaction: Transaction) {
    transactions.add(transaction)
}

fun removeTransactionFromList(transactions: MutableList<Transaction>, transaction: Transaction) {
    transactions.remove(transaction)
}

fun findTransactionInList(transactions: List<Transaction>, id: String): Transaction? {
    return transactions.find { it.id == id }
}

fun printTransactionsList(transactions: List<Transaction>) {
    transactions.forEach { println(it) }
}