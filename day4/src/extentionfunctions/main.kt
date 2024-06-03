package extentionfunctions

fun main() {
    val event1 = Event(1, "Kotlin Conference", "2024-06-15")

    // Adding tags
    event1.addTag("Tech")
    event1.addTag("Conference")

    // Listing tags
    println("Tags for event1: ${event1.listTags()}")

    // Removing a tag
    event1.removeTag("Tech")
    println("Tags for event1 after removal: ${event1.listTags()}")

    // Adding categories
    event1.addCategory("Technology")
    event1.addCategory("Education")

    // Listing categories
    println("Categories for event1: ${event1.listCategories()}")

    // Removing a category
    event1.removeCategory("Education")
    println("Categories for event1 after removal: ${event1.listCategories()}")
}