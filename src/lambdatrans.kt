class Transactiondetails(val transactionId: Int,val amount: Double,val date: String)

class TransactionLists {
    private val trans = mutableListOf<Transactiondetails>()

    fun addTransaction(id: Int, amount: Double, date: String) {
        val transactions = Transactiondetails(id, amount, date)
        trans.add(transactions)
    }

    fun filterAndSort(predicate: (Transactiondetails) -> Boolean, comparator: Comparator<Transactiondetails>) =
        trans.filter(predicate).sortedWith(comparator)

    fun filterByAmountRange(minAmount: Double, maxAmount: Double) =
        filterAndSort({ it.amount in minAmount..maxAmount }, compareBy { it.amount })

    fun displayTransactions(filteredTransactions: List<Transactiondetails>) {
        filteredTransactions.forEach {
            println("ID: ${it.transactionId}, Amount: ${it.amount}, Date: ${it.date}")
        }
    }
}

// Example usage:
fun main() {
    val transactionList = TransactionLists()
    transactionList.addTransaction(1, 61000.0,"12-04-24")
    transactionList.addTransaction(2, 4300.0,"30-02-24")
    transactionList.addTransaction(3, 11100.0,"05-05-24")
    transactionList.addTransaction(4, 50000.0,"01-02-24")

    val filteredByAmount = transactionList.filterByAmountRange(4300.0,61000.0)
    println("\nTransactions filtered and sorted by amount:")
    transactionList.displayTransactions(filteredByAmount)
}
