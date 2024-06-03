import java.time.LocalDate
import java.util.Scanner

data class basicuser(
    val eventName: String,
    val eventDate: LocalDate,
    val attendeeCount: Int
)

fun main() {
    val scanner = Scanner(System.`in`)

    println("Welcome to the Event Creator!")

    // Prompt user for event details
    print("Enter event name: ")
    val eventName = scanner.nextLine()

    // Get event date with error handling
    val eventDate: LocalDate
    while (true) {
        print("Enter event date (YYYY-MM-DD): ")
        val dateInput = scanner.nextLine()
        eventDate = try {
            LocalDate.parse(dateInput)
        } catch (e: Exception) {
            println("Invalid date format! Please enter the date in YYYY-MM-DD format.")
            continue
        }
        break
    }

    // Get attendee count with error handling
    val attendeeCount: Int
    while (true) {
        print("Enter attendee count: ")
        val countInput = scanner.nextLine()
        attendeeCount = try {
            countInput.toInt()
        } catch (e: NumberFormatException) {
            println("Invalid input! Please enter a valid number.")
            continue
        }
        break
    }

    // Create the event
    val event = Event(eventName, eventDate, attendeeCount)

    // Display event details
    println("\nNew Event Created:")
    println("Event Name: ${event.eventName}")
    println("Event Date: ${event.eventDate}")
    println("Attendee Count: ${event.attendeeCount}")

    scanner.close()
}