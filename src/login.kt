class User(val username: String, val password: String) {
    private var loggedIn = false

    fun login(username: String, password: String): Boolean {
        if (this.username == username && this.password == password) {
            loggedIn = true
            return true
        }
        return false
    }

    fun display(transactionList: TransactionList) {
        if (loggedIn) {
            println("Expense Summary for $username:")
            var totalExpense = 0.0
            for (transaction in transactionList.transactions) {
                totalExpense += transaction.amount
                println("ID: ${transaction.transactionId}, Amount: ${transaction.amount}")
            }
            println("Total Expense: $totalExpense")
        } else {
            println("login to view the expense summary.")
        }
    }
}


fun main() {
    val transactionList = TransactionList()
    transactionList.addTransaction(1, 65000.0)
    transactionList.addTransaction(2, 4200.0)

    val user = User("raji", "guna1")

    if (user.login("raji", "guna1")) {
        user.display(transactionList)
    } else {
        println("Login failed.")
    }
}