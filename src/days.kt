enum class days(var color: String) {
    Sunday("yellow"),
    Monday("Red"),
    Tuesday(""),
    Wednesday(""),
    Thursday(""),
    Friday(""),
    Saturday("")
}

fun main() {
    val color = days.Monday.color;
    println("$color")
}
