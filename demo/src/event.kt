import java.time.LocalDate

data class Event(
    val eventName: String,
    val eventDate: LocalDate,
    val attendeeCount: Int
)

fun main() {
    // Example usage:
    val event = Event("Conference", LocalDate.now(), 200)

    println("Event Name: ${event.eventName}")
    println("Event Date: ${event.eventDate}")
    println("Attendee Count: ${event.attendeeCount}")
}