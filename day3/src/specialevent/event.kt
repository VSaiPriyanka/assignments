package specialevent

open class Event(val name: String, val date: String, val location: String) {
    open fun eventDetails() {
        println("Event: $name\nDate: $date\nLocation: $location")
    }
}