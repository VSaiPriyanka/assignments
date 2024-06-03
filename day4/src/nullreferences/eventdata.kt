package nullreferences

// Simulate a function that retrieves event data from a database or service, which might return null
fun getEventById(eventId: Int): Event? {
    // Simulated database retrieval
    return if (eventId == 1) {
        Event(1, "Kotlin Conference", "A conference about Kotlin")
    } else {
        null
    }
}

// Function to process event data, ensuring null safety
fun processEvent(eventId: Int) {
    // Retrieve the event, which might be null
    val event: Event? = getEventById(eventId)

    // Use the safe call operator to access properties safely
    val eventName: String? = event?.name
    val eventDescription: String? = event?.description

    // Provide default values using the Elvis operator
    val displayName = eventName ?: "Unknown Event"
    val displayDescription = eventDescription ?: "No description available"

    // Print or use the event data
    println("Event Name: $displayName")
    println("Event Description: $displayDescription")

    // Use 'let' to execute code only if event is not null
    event?.let {
        println("Processing event with ID: ${it.id}")
        // Additional processing can go here
    } ?: run {
        // Handle the case where the event is null
        println("Event not found for ID: $eventId")
    }
}