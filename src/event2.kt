import java.util.*

data class Event(val name: String, val date: String, val attendeeCount: Int)
var sc = Scanner(System.`in`)


fun main() {

    println("Enter the event name")
    var name=sc.next()

    println("Enter the event date")
    var date=sc.next()

    println("Enter the attendee count")
    var attendeeCount=sc.nextInt()

    val event = Event(name, date, attendeeCount)

    println("Event Name: ${event.name}")
    println("Event Date: ${event.date}")
    println("Attendee Count: ${event.attendeeCount}")
}
