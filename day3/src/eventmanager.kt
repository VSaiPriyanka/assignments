class EventManager {

    // Inner class representing an Event
    data class Event(val id: Int, val name: String, val date: String)

    // Mutable list to store events
    private val events = mutableListOf<Event>()

    // Method to add an event
    fun addEvent(id: Int, name: String, date: String) {
        val event = Event(id, name, date)
        events.add(event)
        println("Event added: $event")
    }

    // Method to remove an event by ID
    fun removeEvent(id: Int) {
        val eventToRemove = events.find { it.id == id }
        if (eventToRemove != null) {
            events.remove(eventToRemove)
            println("Event removed: $eventToRemove")
        } else {
            println("Event with ID $id not found.")
        }
    }

    // Method to list all events
    fun listEvents() {
        if (events.isEmpty()) {
            println("No events available.")
        } else {
            println("Listing all events:")
            events.forEach { println(it) }
        }
    }
}

fun main() {
    val eventManager = EventManager()
    eventManager.addEvent(1, "Kotlin Conference", "2024-05-20")
    eventManager.addEvent(2, "Android Summit", "2024-06-15")
    eventManager.listEvents()
    eventManager.removeEvent(1)
    eventManager.listEvents()
}