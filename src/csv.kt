/*interface Exportable {

    fun exportToCSV(transactions2: List<Transaction2>): String

}

data class Transaction2(val id: Int,val amount: Double)

class Transexport : Exportable {

    override fun exportToCSV(transactions2: List<Transaction2>): String {

        val header = "ID,Amount"

        val data = transactions2.joinToString(separator = "\n") { "${it.id},${it.amount}" }

        return "$header\n$data"

    }

}

fun main() {

    val transactions = listOf(

        Transaction2(334, 660.0),

         Transaction2(456,  2500.0),

        Transaction2(768,  11200.0)


    )

    val export = Transexport()

    val csvData = export.exportToCSV(transactions)

    println(csvData)

}*/


/*data class Transaction2(var _id: Int, var _date: String, var _amount: Double) {

    var id: Int
        get() = _id
        set(value) {
            if (value >= 0) {
                _id = value
            }
        }

    var date: String
        get() = _date
        set(value) {
            // Add validation if needed
            _date = value
        }

    var amount: Double
        get() = _amount
        set(value) {
            if (value >= 0) {
                _amount = value
            }
        }

    override fun toString(): String {
        return "Transaction(id=$_id, date=$_date, amount=$_amount)"
    }
}

fun main() {
    val transaction = Transaction2(334, "20-05-24", 3040.0)

    // Accessing properties using getters
    println("Transaction ID: ${transaction.id}")
    println("Transaction Date: ${transaction.date}")
    println("Transaction Amount: ${transaction.amount}")
}*/



data class Transaction2(val id: Int, val date: String, val amount: Double)

fun transaction(transactions2: List<Transaction2>) {
    transactions2.forEach { println(it) }
}

fun transaction(transactions2: Set<Transaction2>) {
    transactions2.forEach { println(it) }
}

fun transaction(transactions2: Map<Int, Transaction2>) {
    transactions2.forEach { (_, value) -> println(value) }
}

fun main() {
    val transactionsList = listOf(
        Transaction2(335, "05-05-024", 4100.0),
        Transaction2(456, "12-04-24", 130.0)
    )

    val transactionsSet = setOf(
        Transaction2(707, "09-04-24", 1350.0),
        Transaction2(109, "29-03-24", 890.0)
    )

    val transactionsMap = mapOf(
        348 to Transaction2(348, "11-05-24", 7600.0),
        890 to Transaction2(890, "19-05-24", 905.0)
    )

    transaction(transactionsList)
    transaction(transactionsSet)
    transaction(transactionsMap)
}