interface Display{
    fun showeventdetails(eventname: String,eventdate: String,members: Int)
}

data class evemange(val eventname: String, var eventdate: String,var members: Int )
open class eventmangement:Display {
    private val events = mutableListOf<evemange>()

    private var onadded: ((String) -> Unit)? = null
    private var onremoved: ((String) -> Unit)? = null


    fun setOnEventAddedListener(listener: (String) -> Unit) {
        onadded = listener
        println("Event Details")
        println("-----------------------")
    }

    fun setOnEventRemovedListener(listener: (String) -> Unit) {
        onremoved = listener
    }

    fun addEvent(eventname: String,eventdate:String,members:Int) {
        val event=evemange(eventname,eventdate, members)
        events.add(event)
        println("Event added: $event")
        onadded?.invoke(eventname)

    }


    fun removeEvent(eventname: String,eventdate: String,members: Int) {
        val event=evemange(eventname,eventdate, members)
        events.remove(event)
        println("Event removed: $event")
        onremoved?.invoke(eventname)
        println("----------------------------------------------------------")

    }

    fun listEvents() {
        if (events.isEmpty()) {
            println("No events available.")
        } else {
            println("Events:")
            events.forEach { println(it) }
        }

    }


    override fun showeventdetails(eventname: String, eventdate: String, members: Int) {
        val event=evemange(eventname,eventdate, members)
        println("Event Detail:$event")
        println("------------------------------------------------------------")

    }
}



class SpecialEvent : eventmangement() {
    private val vipList = mutableListOf<String>()
    private var hasPremiumServices = false

    fun addToVipList(eventname: String) {
        vipList.add(eventname)
    }

    fun removeFromVipList(eventname: String) {
        vipList.remove(eventname)
    }

    fun getVipList(): List<String> {
        return vipList.toList()
    }

    fun enablePremiumServices() {
        hasPremiumServices = true
    }

    fun hasPremiumServices(): Boolean {
        return hasPremiumServices
    }
}



fun main() {
    val eventManager = eventmangement()

    eventManager.setOnEventAddedListener { event ->

        println("Notification: Event added - $event")

    }

    eventManager.setOnEventRemovedListener { event ->

        println("Notification: Event removed - $event")

    }

    eventManager.addEvent("Googling","02-05-24",45)
    eventManager.addEvent("Mapping","03-05-24",30)
    eventManager.addEvent("Codility","04-05-24",55)
    println("-----------------------------------------------------------")

    eventManager.removeEvent("Mapping","03-05-24",30)
    eventManager.listEvents()

    println("-----------------------------------------------------------")


    val spleventmanager= SpecialEvent()

    spleventmanager.addEvent("Technozarre","11-05-24",32)
    spleventmanager.addEvent("Wartech","12-05-24",50)
    spleventmanager.addEvent("Connexions","12-05-24",40)
    spleventmanager.addEvent("Hackathon","14-05-24",21)
    spleventmanager.addToVipList("Technozarre")
    spleventmanager.addToVipList("Connexions")
    spleventmanager.addToVipList("Hackathon")
    spleventmanager.enablePremiumServices()
    println("-----------------------------------------------------------")

    println("VIP List: ${spleventmanager.getVipList()}")
    println("Premium Services: ${spleventmanager.hasPremiumServices()}")

    spleventmanager.removeFromVipList("Connexions")

    println("Updated VIP List: ${spleventmanager.getVipList()}")

}


