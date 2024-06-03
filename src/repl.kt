fun main() {
    val s = "Hello World"
    println(s)
    println("------------------")

    val a=21
    val b=13
    val sum=a.plus(b)
    println(sum)
    println("------------------")

    var name= "Raji"
    println("Hello,$name")
    println("------------------")

    for (ch in 'a'..'x') {
        print("$ch, ")
    }
    println("------------------")

    val num= listOf(1,2,3,4,5)
    println(num.filter { it%2==0 })


}