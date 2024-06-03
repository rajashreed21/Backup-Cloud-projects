
/*interface Event1 {
    fun schedule()
    fun reschedule()
}

class Task : Event1 {
    override fun schedule() {
        println("Task scheduled")
    }

    override fun reschedule() {
        println("Task rescheduled")
    }
}


class Meeting(private val name String : Event1 {

    override fun schedule() {
        println("Meeting scheduled")
    }

    override fun reschedule() {
        println("Meeting rescheduled")
    }
}

class Meeting(private val name: String) : Event1 {
    private var scheduled = false

    override fun schedule() {
        if (!scheduled) {
            scheduled = true
            println("Meeting '$name' scheduled.")
        } else {
            println("Meeting '$name' is already scheduled.")
        }
    }

    override fun reschedule() {
        if (scheduled) {
            println("Meeting '$name' rescheduled.")
        } else {
            println("Cannot reschedule meeting '$name' that is not yet scheduled.")
        }
    }
}


class Task(private val taskDescription: String) : Event1 {
    private var scheduled = false

    override fun schedule() {
        if (!scheduled) {
            scheduled = true
            println("Task '$taskDescription' scheduled.")
        } else {
            println("Task '$taskDescription' is already scheduled.")
        }
    }

    override fun reschedule() {
        if (scheduled) {
            println("Task '$taskDescription' rescheduled.")
        } else {
            println("Cannot reschedule task '$taskDescription' that is not yet scheduled.")
        }
    }
}

class Schedule {
    fun addEvent(event: Event1) {
        event.schedule()
    }

    fun rescheduleEvent(event: Event1) {
        event.reschedule()
    }
}

fun main() {
    val schedule = Schedule()
    val task = Task()
    val meeting = Meeting()

    schedule.addEvent(task)
    schedule.addEvent(meeting)

    schedule.rescheduleEvent(task)
    schedule.rescheduleEvent(meeting)
}*/



/*interface Event1 {
    fun schedule()
    fun reschedule()
}

class Task(private val taskDesc: String) : Event1 {
    private var scheduled = false

    override fun schedule() {
        if (!scheduled) {
            scheduled = true
            println("Task '$taskDesc' scheduled.")
        } else {
            println("Task '$taskDesc' is already scheduled.")
        }
    }

    override fun reschedule() {
        if (scheduled) {
            println("Task '$taskDesc' rescheduled.")
        } else {
            println("Cannot reschedule task '$taskDesc' ")
        }
    }
}

class Meeting(private val meetingname: String) : Event1 {
    private var scheduled = false

    override fun schedule() {
        if (!scheduled) {
            scheduled = true
            println("Meeting '$meetingname' scheduled")
        } else {
            println("Meeting '$meetingname' is already scheduled")
        }
    }

    override fun reschedule() {
        if (scheduled) {
            println("Meeting '$meetingname' rescheduled.")
        } else {
            println("Cannot reschedule meeting '$meetingname' ")
        }
    }
}

class Schedule {
    fun addEvent(event: Event1) {
        event.schedule()
    }

    fun rescheduleEvent(event: Event1) {
        event.reschedule()
    }
}

fun main() {
    val schedule = Schedule()
    val task = Task("Daily Task")
    val meeting = Meeting("Project Meeting")

    schedule.addEvent(task)
    schedule.addEvent(meeting)

    schedule.rescheduleEvent(meeting)
    schedule.rescheduleEvent(task)
}*/



/*data class Event1(
    val name: String,
    val date: String,
    val type: String
)

fun main() {
    val events = listOf(
        Event1("Symposium", "03-05-24", "Meeting"),
        Event1("Concert", "17-05-24", "Task"),
        Event1("Porjectexpo", "03-05-24", "Meeting"),
        Event1("Concert", "24-04-24", "Task")
    )

    val filteredByDate = events.filter { it.date == "date"}
    println("Events on 03-05-24:")
    filteredByDate.forEach { println("${it.name} (${it.type})") }

    val filteredByType = events.filter { it.type == "Meeting" }
    println("\nMeeting events:")
    filteredByType.forEach { println("${it.name} on ${it.date}") }
}*/



interface Data
data class Event1(val name: String, val date: String) : Data
data class Attendee(val name: String, val number: String,val email:String) : Data

class DataManager<T : Data> {
    private val dataItems: MutableList<T> = mutableListOf()

    fun addData(data: T) {
        dataItems.add(data)
    }

    fun getData(): List<T> {
        return dataItems.toList()
    }
}

fun main() {
    val eventManager = DataManager<Event1>()
    val attendeeManager = DataManager<Attendee>()

    eventManager.addData(Event1("Fliper", "12-05-24"))
    eventManager.addData(Event1("Coderace", "13-05-24"))
    eventManager.addData(Event1("Hackathon", "14-05-24"))

    attendeeManager.addData(Attendee("Subiksha", "7839832945","subi21@gmail.com"))
    attendeeManager.addData(Attendee("Sabari", "1730582948","sabari3@gmail.com"))
    attendeeManager.addData(Attendee("Kani", "7659274638","kani@gmail.com"))

    val events = eventManager.getData()
    println("Events:")
    events.forEach { println("${it.name} on ${it.date}") }

    val attendees = attendeeManager.getData()
    println("\nAttendees:")
    attendees.forEach { println("${it.name} ${it.number} ${it.email}") }
}