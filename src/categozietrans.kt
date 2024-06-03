private  class Transaction(val amount: Double, val date: String, val category: String) {
    fun data(): String {
        return "Amount: $amount, Date: $date, Category: $category"
    }

    fun categorize(): String {
       return when (category.toLowerCase()) {
            "food" -> "Food"
            "utilities" -> "Utilities"
            "entertainment" -> "Entertainment"
            "shopping" -> "Shopping"
             else -> "Other"
        }
    }
}

// Example usage:
fun main() {
    val transaction1 = Transaction(1000.0, "02-05-24", "Food")
    val transaction2 = Transaction(2000.0, "11-04-24",  "Entertainment")
    val transaction3 = Transaction(5000.0, "15-05-24", "Shopping")


    println(transaction1)
    println("Category: ${transaction1.categorize()}")

    println(transaction2)
    println("Category: ${transaction2.categorize()}")

    println(transaction3)
    println("Category: ${transaction3.categorize()}")
}