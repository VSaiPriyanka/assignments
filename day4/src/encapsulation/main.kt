package encapsulation

fun main() {
    val transaction = Transaction()

    // Using setters to modify properties
    transaction.transactionId = "12345"
    transaction.amount = 250.0
    transaction.description = "Payment for services"

    // Trying to access sensitive data directly
    println(transaction.sensitiveData) // Outputs: Access Denied

    // Using a method to update sensitive data
    transaction.updateSensitiveData("SensitiveInfo123")

    // Trying to access sensitive data again
    println(transaction.sensitiveData) // Still outputs: Access Denied

    // Clearing sensitive data
    transaction.clearSensitiveData()
}