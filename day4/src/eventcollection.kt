import java.time.LocalDate

// Define the Event data class
data class Event(val name: String, val date: LocalDate, val type: String)

// Main function to demonstrate the filtering
fun main() {
    // Create a list of events
    val events = listOf(
        Event("Concert", LocalDate.parse("2023-05-20"), "Music"),
        Event("Art Exhibition", LocalDate.parse("2023-06-15"), "Art"),
        Event("Science Fair", LocalDate.parse("2023-05-25"), "Education"),
        Event("Football Match", LocalDate.parse("2023-05-20"), "Sport"),
        Event("Book Reading", LocalDate.parse("2023-06-10"), "Literature")
    )

    // Filter events by a specific date
    val eventsOnMay20 = filterEventsByDate(events, LocalDate.parse("2023-05-20"))
    println("Events on 2023-05-20:")
    eventsOnMay20.forEach { println(it) }

    // Filter events by a specific type
    val musicEvents = filterEventsByType(events, "Music")
    println("\nMusic Events:")
    musicEvents.forEach { println(it) }
}

// Function to filter events by date
fun filterEventsByDate(events: List<Event>, date: LocalDate): List<Event> {
    return events.filter { it.date == date }
}

// Function to filter events by type
fun filterEventsByType(events: List<Event>, type: String): List<Event> {
    return events.filter { it.type.equals(type, ignoreCase = true) }
}