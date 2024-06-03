package transactioncollections

fun main() {
    val transactionList: MutableList<Transaction> = mutableListOf()
    val transactionSet: MutableSet<Transaction> = mutableSetOf()
    val transactionMap: MutableMap<String, Transaction> = mutableMapOf()

    val transaction1 = Transaction("1", 100.0)
    val transaction2 = Transaction("2", 200.0)

    // List operations
    addTransactionToList(transactionList, transaction1)
    addTransactionToList(transactionList, transaction2)
    printTransactionsList(transactionList)
    println(findTransactionInList(transactionList, "1"))
    removeTransactionFromList(transactionList, transaction1)
    printTransactionsList(transactionList)

    // Set operations
    addTransactionToSet(transactionSet, transaction1)
    addTransactionToSet(transactionSet, transaction2)
    printTransactionsSet(transactionSet)
    println(findTransactionInSet(transactionSet, "1"))
    removeTransactionFromSet(transactionSet, transaction1)
    printTransactionsSet(transactionSet)

    // Map operations
    addTransactionToMap(transactionMap, transaction1)
    addTransactionToMap(transactionMap, transaction2)
    printTransactionsMap(transactionMap)
    println(findTransactionInMap(transactionMap, "1"))
    removeTransactionFromMap(transactionMap, "1")
    printTransactionsMap(transactionMap)
}