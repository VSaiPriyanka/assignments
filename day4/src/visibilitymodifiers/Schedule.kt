package visibilitymodifiers

import interfaces.Schedulable

class Schedule {
    private val events = mutableListOf<Schedulable>()

    fun addEvent(event: Schedulable, time: String): String {
        events.add(event)
        return event.schedule(time)
    }

    fun rescheduleEvent(event: Schedulable, newTime: String): String {
        return event.reschedule(newTime)
    }

    fun listEvents(): List<Schedulable> {
        return events
    }
}