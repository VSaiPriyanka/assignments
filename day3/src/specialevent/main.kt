package specialevent

fun main() {
    val specialEvent = SpecialEvent("Concert", "2024-06-21", "Madison Square Garden")

    specialEvent.addVip("Alice")
    specialEvent.addVip("Bob")
    specialEvent.removeVip("Charlie") // VIP not found

    specialEvent.addPremiumService("Backstage Pass")
    specialEvent.addPremiumService("Complimentary Drinks")
    specialEvent.removePremiumService("Free Parking") // Premium service not found

    specialEvent.eventDetails()
}