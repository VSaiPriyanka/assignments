class User(private val username: String, private val password: String) {
    private var loggedIn = false
    private val expenses = mutableListOf<Double>()

    fun login(username: String, password: String) {
        if (username == this.username && password == this.password) {
            loggedIn = true
            println("Login successful!")
        } else {
            println("Invalid username or password.")
        }
    }

    fun addExpense(expense: Double) {
        if (loggedIn) {
            expenses.add(expense)
            println("Expense added successfully.")
        } else {
            println("Please log in first.")
        }
    }

    fun displayExpenseSummary() {
        if (loggedIn) {
            if (expenses.isNotEmpty()) {
                println("Expense Summary:")
                expenses.forEachIndexed { index, expense ->
                    println("${index + 1}. $expense")
                }
            } else {
                println("No expenses to display.")
            }
        } else {
            println("Please log in first.")
        }
    }
}

// Example usage:
fun main() {
    val user1 = User("user123", "password123")
    user1.login("user123", "password123")

    user1.addExpense(100.0)
    user1.addExpense(50.0)
    user1.addExpense(75.0)

    user1.displayExpenseSummary()
}