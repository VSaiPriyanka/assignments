fun main() {
    val user = User("priya", 23)

    // Dynamic welcome message using string templates
    val welcomeMessage = buildWelcomeMessage(user)

    println(welcomeMessage)
}

data class User(val name: String, val age: Int)

fun buildWelcomeMessage(user: User): String {
    return """
        |Welcome, ${user.name}!
        |We are delighted to have you with us.
        |At ${user.age} years old, you bring valuable experience to our community.
        |Enjoy your time here!
    """.trimMargin()
}