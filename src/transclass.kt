data class transclass(val amount: Double, val date: String, val category: String) {
     fun data():  String{
        return "Amount: $amount, Date: $date, Category: $category"
    }
}

fun main() {
    val transactionclass1 = transclass(1005.0, "02-05-24", "Books")
    val transactionclass2 = transclass(5000.0, "21-05-24", "Dresses")

    println(transactionclass1)
    println(transactionclass2)
}