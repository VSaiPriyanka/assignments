package displayinterface


fun main() {
    val eventManager = EventManager()
    eventManager.addEvent(1, "Kotlin Conference", "2024-05-20")
    eventManager.addEvent(2, "Android Summit", "2024-06-15")
    eventManager.listEvents()
    eventManager.removeEvent(1)
    eventManager.listEvents()
}