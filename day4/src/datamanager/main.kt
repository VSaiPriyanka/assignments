package datamanager

fun main() {
    val attendeeManager = DataManager<Attendee>()
    val eventManager = DataManager<Event>()

    // Adding Attendees
    val attendee1 = Attendee(1, "John Doe", "john@example.com")
    val attendee2 = Attendee(2, "Jane Smith", "jane@example.com")

    attendeeManager.add(attendee1)
    attendeeManager.add(attendee2)

    // Adding Events
    val event1 = Event(1, "Kotlin Workshop", "2024-05-20")
    val event2 = Event(2, "Android Conference", "2024-06-15")

    eventManager.add(event1)
    eventManager.add(event2)

    // Retrieving all Attendees
    val allAttendees = attendeeManager.getAll()
    println("All Attendees: $allAttendees")

    // Retrieving all Events
    val allEvents = eventManager.getAll()
    println("All Events: $allEvents")

    // Finding an Attendee by ID
    val foundAttendee = attendeeManager.find { it.id == 1 }
    println("Found Attendee: $foundAttendee")

    // Finding an Event by Title
    val foundEvent = eventManager.find { it.title == "Android Conference" }
    println("Found Event: $foundEvent")
}