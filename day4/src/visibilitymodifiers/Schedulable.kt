package visibilitymodifiers

 interface Schedulable {
    fun schedule(time: String): String
    fun reschedule(newTime: String): String
}
