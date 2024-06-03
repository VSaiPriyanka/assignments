package inheritance

class Expense(id: Int, amount: Double, description: String, date: String) :
    Transaction(id, amount, description, date) {
    override fun toString(): String {
        return "Expense(ID: $id, Amount: $amount, Description: $description, Date: $date)"
    }
}