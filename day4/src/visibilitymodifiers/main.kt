package visibilitymodifiers

fun main() {
    val schedule = Schedule()
    val meeting = Meeting("2024-05-20 10:00")
    val appointment = Appointment("2024-05-20 15:00")
    println(schedule.addEvent(meeting, "2024-05-20 10:00"))
    println(schedule.addEvent(appointment, "2024-05-20 15:00"))
    println(schedule.rescheduleEvent(meeting, "2024-05-20 11:00"))
    println(schedule.rescheduleEvent(appointment, "2024-05-20 16:00"))
    schedule.listEvents().forEach { event ->
        when (event) {
            is Meeting -> println("Scheduled Meeting at: ${event.getTime()}")
            is Appointment -> println("Scheduled Appointment at: ${event.getTime()}")
        }
    }
}