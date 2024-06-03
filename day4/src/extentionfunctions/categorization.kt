package extentionfunctions

// A map to store categories for events
private val eventCategories = mutableMapOf<Event, MutableSet<String>>()

// Extension function to add a category to an event
fun Event.addCategory(category: String) {
    eventCategories.getOrPut(this) { mutableSetOf() }.add(category)
}

// Extension function to remove a category from an event
fun Event.removeCategory(category: String) {
    eventCategories[this]?.remove(category)
    if (eventCategories[this]?.isEmpty() == true) {
        eventCategories.remove(this)
    }
}

// Extension function to list all categories of an event
fun Event.listCategories(): Set<String> {
    return eventCategories[this] ?: emptySet()
}