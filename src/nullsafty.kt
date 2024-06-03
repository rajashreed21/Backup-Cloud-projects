/*private data class Transactions2(val id: Int, val amount: Double?)

private fun getTransactionDetails(transaction: Transactions2?) {
    val transactionId=transaction?.id ?:0
    val transactionAmount = transaction?.amount ?: 0.0

    println("Transaction ID: $transactionId")
    println("Transaction Amount: $transactionAmount")
}

fun main() {
    val transaction1 = Transactions2(334, 3220.0)
    val transaction2 = Transactions2(256, null)
    val transaction3: Transactions2? = null

    getTransactionDetails(transaction1)
    getTransactionDetails(transaction2)
    getTransactionDetails(transaction3)
}*/




/*private data class Transactions2(val id: Int, val amount: Double?)

class InvalidTransactionException(message: String) : Exception(message)
class InvalidTransactionAmountException(message: String) : Exception(message)

private fun validateTransaction(transaction: Transactions2?) {
    if (transaction == null) {
        throw InvalidTransactionException("Invalid Transaction ")
    }
    if (transaction.amount!! <= 0) {
        throw InvalidTransactionAmountException("Invalid transaction amount: ${transaction.amount}")
    }
}

private fun processTransaction(transaction: Transactions2?) {
    try {
        validateTransaction(transaction)

        println("Processing transaction ID: ${transaction!!.id} with amount: ${transaction.amount}")
    } catch (e: InvalidTransactionException) {
        println(e.message)
    } catch (e: InvalidTransactionAmountException) {
        println(e.message)
    }
}

fun main() {
    val transaction1 = Transactions2(334, 3220.0)
    val transaction2 = Transactions2(256, -989.0)
    val transaction3: Transactions2? = null

    processTransaction(transaction1)
    processTransaction(transaction2)
    processTransaction(transaction3)

}*/


private data class Transactions2(val id: Int, val amount: Double)

private fun List<Transactions2>.totalExpenses(): Double {
    return this.filter { it.amount < 0 }
        .sumOf { it.amount }
}

private fun List<Transactions2>.totalIncomes(): Double {
    return this.filter { it.amount > 0 }
        .sumOf { it.amount }
}

fun main() {
    val transactions = listOf(
        Transactions2(335, 5500.0),
        Transactions2(256, -732.0),
        Transactions2(860, 1230.0),
        Transactions2(224, -450.0),
    )

    val totalExpenses = transactions.totalExpenses()
    val totalIncomes = transactions.totalIncomes()

    println("Total Expenses: $totalExpenses")
    println("Total Incomes: $totalIncomes")
}