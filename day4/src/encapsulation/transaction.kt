package encapsulation

class Transaction {
    // Private properties to restrict direct access
    private var _transactionId: String = ""
    private var _amount: Double = 0.0
    private var _description: String = ""
    private var _sensitiveData: String = ""
    // Getter and setter for transactionId
    var transactionId: String
        get() = _transactionId
        set(value) {
            // Additional logic or validation can be added here
            _transactionId = value
        }
    // Getter and setter for amount
    var amount: Double
        get() = _amount
        set(value) {
            // Additional logic or validation can be added here
            if (value >= 0) {
                _amount = value
            } else {
                throw IllegalArgumentException("Amount must be non-negative")
            }
        }

    // Getter and setter for description
    var description: String
        get() = _description
        set(value) {
            // Additional logic or validation can be added here
            _description = value
        }

    // Getter and setter for sensitive data with restricted access
    var sensitiveData: String
        get() = "Access Denied" // Prevents direct access to sensitive data
        private set(value) {
            // Only internal methods or authorized classes can modify sensitive data
            _sensitiveData = value
        }

    // Function to update sensitive data securely
    fun updateSensitiveData(newData: String) {
        // Additional security checks can be added here
        _sensitiveData = newData
    }

    // Function to clear sensitive data securely
    fun clearSensitiveData() {
        _sensitiveData = ""
    }
}