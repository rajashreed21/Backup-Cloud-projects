open class transsaction(val id:Int, val amount: Double, val date: String,) {
    open fun display() {
        println("Id: $id ,Amount: $amount,Date: $date")
    }
}

class Income(id : Int,amount: Double,date: String, val source: String) : transsaction(id ,amount, date) {
    override fun display() {
        println("Source: $source")
    }
}

class Expense(id: Int,amount: Double, date: String, val category: String) : transsaction(id, amount, date) {
    override fun display() {
        super.display()
        println("Category: $category")
    }
}

fun main() {
    val income = Income(1, 65000.0, "02-02-24","work")
    val expense = Expense(2, 50000.0, "01-01-24","Shopping")

    println("Income Details:")
    income.display()

    println("\nExpense Details:")
    expense.display()
}
