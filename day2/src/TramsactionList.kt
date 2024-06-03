data class Transaction(val id: Int, var amount: Double, var description: String) {
}

class TransactionList {
    private val transactions = mutableListOf<Transaction>()

    // Function to add a new transaction
    fun addTransaction(id: Int, amount: Double, description: String) {
        val newTransaction = Transaction(id, amount, description)
        transactions.add(newTransaction)
    }

    // Function to delete a transaction by its ID
    fun deleteTransactionById(id: Int) {
        val transaction = transactions.find { it.id == id }
        if (transaction != null) {
            transactions.remove(transaction)
        } else {
            println("Transaction with ID $id not found.")
        }
    }

    // Function to edit a transaction by its ID
    fun editTransactionById(id: Int, newAmount: Double, newDescription: String) {
        val transaction = transactions.find { it.id == id }
        if (transaction != null) {
            transaction.amount = newAmount
            transaction.description = newDescription
        } else {
            println("Transaction with ID $id not found.")
        }
    }

    // Function to print all transactions
    fun printAllTransactions() {
        println("Transactions:")
        transactions.forEach { println("ID: ${it.id}, Amount: ${it.amount}, Description: ${it.description}") }
    }
}

fun main() {
    val transactionList = TransactionList()

    // Adding transactions
    transactionList.addTransaction(1, 100.0, "Groceries")
    transactionList.addTransaction(2, 50.0, "Fuel")

    // Printing all transactions
    transactionList.printAllTransactions()

    // Editing transaction with ID 1
    transactionList.editTransactionById(1, 120.0, "Groceries and household items")

    // Printing all transactions after editing
    transactionList.printAllTransactions()

    // Deleting transaction with ID 2
    transactionList.deleteTransactionById(2)

    // Printing all transactions after deleting
    transactionList.printAllTransactions()
}