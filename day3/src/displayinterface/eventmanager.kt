package displayinterface

// Define the Display interface
interface Display {
    fun showEventDetails(event: EventManager.Event)
}

// EventManager class implementing Display interface
class EventManager : Display {

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
            events.forEach { showEventDetails(it) }
        }
    }

    // Implementation of showEventDetails from Display interface
    override fun showEventDetails(event: Event) {
        println("Event Details: ID=${event.id}, Name=${event.name}, Date=${event.date}")
    }
}

