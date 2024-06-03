package specialevent

class SpecialEvent(
    name: String,
    date: String,
    location: String,
    val vipList: MutableList<String> = mutableListOf(),
    val premiumServices: MutableList<String> = mutableListOf()
) : Event(name, date, location) {

    fun addVip(guest: String) {
        vipList.add(guest)
        println("VIP $guest added.")
    }

    fun removeVip(guest: String) {
        if (vipList.remove(guest)) {
            println("VIP $guest removed.")
        } else {
            println("VIP $guest not found.")
        }
    }

    fun addPremiumService(service: String) {
        premiumServices.add(service)
        println("Premium service $service added.")
    }

    fun removePremiumService(service: String) {
        if (premiumServices.remove(service)) {
            println("Premium service $service removed.")
        } else {
            println("Premium service $service not found.")
        }
    }

    override fun eventDetails() {
        super.eventDetails()
        println("VIP List: ${vipList.joinToString(", ")}")
        println("Premium Services: ${premiumServices.joinToString(", ")}")
    }
}