import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
fun parseEventDateTime(dateTimeString: String, format: String): LocalDateTime? {
    val formatter = DateTimeFormatter.ofPattern(format)
    return try {
        LocalDateTime.parse(dateTimeString, formatter)
    } catch (e: DateTimeParseException) {
        println("Error parsing date and time: ${e.message}")
        null
    }
}

fun main() {
    val dateString1 = "2023-05-20 14:30"
    val dateString2 = "invalid date"

    val format = "yyyy-MM-dd HH:mm"

    val eventDateTime1 = parseEventDateTime(dateString1, format)
    val eventDateTime2 = parseEventDateTime(dateString2, format)

    println("Parsed DateTime 1: $eventDateTime1")
    println("Parsed DateTime 2: $eventDateTime2")
}