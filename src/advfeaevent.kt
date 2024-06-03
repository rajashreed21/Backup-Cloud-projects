/*data class Event2(val id: Int, val name: String, val date: String?)

class EventManager {
    private val events = mutableListOf<Event2?>()

    fun addEvent(event: Event2?) {
        events.add(event)
    }

    fun getEventById(id: Int): Event2? {
        return events.find { it?.id == id }
    }

    fun printEventDetails(id: Int) {
        val event = getEventById(id)

        val eventName = event?.name ?: "Unknown Event"
        val eventDate = event?.date ?: "Unknown Date"

        println("Event Name: $eventName")
        println("Event Date: $eventDate")
    }

    fun printEventDetailsUsingLet(id: Int) {
        val event = getEventById(id)

        event?.let {
            println("Event Name: ${it.name}")
            println("Event Date: ${it.date ?: "Unknown Date"}")
        } ?: run {
            println("Event not found")
        }
    }

    fun printEventDetailsWithRequire(id: Int) {
        val event = getEventById(id)

        requireNotNull(event) { "Event with id $id not found" }

        println("Event Name: ${event.name}")
        println("Event Date: ${event.date ?: "Unknown Date"}")
    }
}

fun main() {
    val eventManager = EventManager()
    eventManager.addEvent(Event2(1, "Conference", "20-03-24"))
    eventManager.addEvent(Event2(2, "Meeting", null))
    eventManager.addEvent(null)

    eventManager.printEventDetails(1)
    eventManager.printEventDetails(2)
    eventManager.printEventDetails(3)

    eventManager.printEventDetailsUsingLet(1)
    eventManager.printEventDetailsUsingLet(2)
    eventManager.printEventDetailsUsingLet(3)

    try {
        eventManager.printEventDetailsWithRequire(1)
        eventManager.printEventDetailsWithRequire(2)
        eventManager.printEventDetailsWithRequire(3)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}*/




/*import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class Event2(val id: Int, val name: String, val date: Date?)

class EventManager {
    private val events = mutableListOf<Event2?>()
    private val dateFormat = SimpleDateFormat("dd-MM-YY", Locale.getDefault())

    fun addEvent(event: Event2?) {
        events.add(event)
    }

    fun parseDate(dateStr: String?): Date? {
        return try {
            if (dateStr != null) dateFormat.parse(dateStr) else null
        } catch (e: Exception) {
            println("Error parsing date: $dateStr")
            null
        }
    }

    fun createAndAddEvent(id: Int, name: String, dateStr: String?) {
        val date = parseDate(dateStr)
        val event = Event2(id, name, date)
        addEvent(event)
    }

    fun getEventById(id: Int): Event2? {
        return events.find { it?.id == id }
    }

    fun printEventDetails(id: Int) {
        val event = getEventById(id)

        val eventName = event?.name ?: "Unknown Event"
        val eventDate = event?.date?.let { dateFormat.format(it) } ?: "Unknown Date"

        println("Event Name: $eventName")
        println("Event Date: $eventDate")
    }
}

fun main() {
    val eventManager = EventManager()

    eventManager.createAndAddEvent(335, "Hackathon", "24-05-24")
    eventManager.createAndAddEvent(567, "Coderace", "invalid-date")
    eventManager.createAndAddEvent(987, "Fliper", null)

    eventManager.printEventDetails(335)
    eventManager.printEventDetails(567)
    eventManager.printEventDetails(987)
}*/








import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class Event2(val id: Int, val name: String, val date: Date?)

class EventManager {
    private val events = mutableListOf<Event2?>()
    private val dateFormat = SimpleDateFormat("mm:HH DD-MM-YY", Locale.getDefault())

    fun addEvent(event: Event2?) {
        events.add(event)
    }

    fun parseDate(dateStr: String?): Date? {
        return try {
            if (dateStr != null) dateFormat.parse(dateStr) else null
        } catch (e: ParseException) {
            println("Error parsing date: $dateStr")
            null
        }
    }

    fun createAndAddEvent(id: Int, name: String, dateStr: String?) {
        val date = parseDate(dateStr)
        val event = Event2(id, name, date)
        addEvent(event)
    }

    fun getEventById(id: Int): Event2? {
        return events.find { it?.id == id }
    }


    fun printEventDetails(id: Int) {
        val event = getEventById(id)

        val eventName = event?.name ?: "Unknown Event"
        val eventDate = event?.date?.let { dateFormat.format(it) } ?: "Unknown Date"

        println("Event Name: $eventName")
        println("Event Date: $eventDate")
    }
}

private val Event2.tags: MutableList<String> by lazy { mutableListOf<String>() }
private val Event2.categories: MutableList<String> by lazy { mutableListOf<String>() }

fun Event2.addTag(tag: String) {
    tags.add(tag)
}

fun Event2.addCategory(category: String) {
    categories.add(category)
}

fun Event2.printTagsAndCategories() {
    println("Event Name: $name")
    println("Tags: ${tags.joinToString(", ")}")
    println("Categories: ${categories.joinToString(", ")}")
}

fun main() {
    val eventManager = EventManager()

    eventManager.createAndAddEvent(335, "Symposium", "10:30AM 22-06-24")
    eventManager.createAndAddEvent(687, "Culturals", "6:30PM 04-06-24")

    val event1 = eventManager.getEventById(335)
    val event2 = eventManager.getEventById(687)

    event1?.addTag("Hackathon")
    event1?.addCategory("Symposium")

    event2?.addTag("Dance")
    event2?.addCategory("Culturals")

    event1?.printTagsAndCategories()
    event2?.printTagsAndCategories()
}