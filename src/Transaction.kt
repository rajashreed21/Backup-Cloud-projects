 class Transactionamt(val transactionId: Int,var amount: Double)


class TransactionList {
    val transactions = mutableListOf<Transactionamt>()

    fun addTransaction(transactionId: Int, amount: Double) {
        val transaction = Transactionamt(transactionId, amount)
        transactions.add(transaction)
    }

    fun deleteTransaction(transactionId: Int): Boolean {
        val transaction = transactions.find { it.transactionId == transactionId }
        return if (transaction != null) {
            transactions.remove(transaction)
            true
        } else {
            false
        }
    }

    fun editTransaction(transactionId: Int, newAmount: Double? = null): Boolean {
        val transaction = transactions.find { it.transactionId == transactionId }
        return if (transaction != null) {
            newAmount?.let { transaction.amount = it }

            true
        } else {
            false
        }
    }
}


fun main() {
    val transactionList = TransactionList()
    transactionList.addTransaction(1, 61000.0)
    transactionList.addTransaction(2, 4300.0)
    transactionList.addTransaction(3, 11100.0)
    transactionList.addTransaction(4, 50000.0)

    println("Transactions before editing:")
    transactionList.transactions.forEach {
        println("ID: ${it.transactionId}, Amount: ${it.amount}")
    }

    transactionList.editTransaction(1, newAmount = 150.0)

    println("\nTransactions after editing:")
    transactionList.transactions.forEach {
        println("ID: ${it.transactionId}, Amount: ${it.amount}")
    }

    transactionList.deleteTransaction(2)

    println("\nTransactions after deleting:")
    transactionList.transactions.forEach {
        println("ID: ${it.transactionId}, Amount: ${it.amount}")
    }
}
