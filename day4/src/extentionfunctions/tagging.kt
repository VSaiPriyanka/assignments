package extentionfunctions

// A map to store tags for events
private val eventTags = mutableMapOf<Event, MutableSet<String>>()

// Extension function to add a tag to an event
fun Event.addTag(tag: String) {
    eventTags.getOrPut(this) { mutableSetOf() }.add(tag)
}

// Extension function to remove a tag from an event
fun Event.removeTag(tag: String) {
    eventTags[this]?.remove(tag)
    if (eventTags[this]?.isEmpty() == true) {
        eventTags.remove(this)
    }
}

// Extension function to list all tags of an event
fun Event.listTags(): Set<String> {
    return eventTags[this] ?: emptySet()
}