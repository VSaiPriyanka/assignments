package visibilitymodifiers

class Meeting(private var time: String) : Schedulable, interfaces.Schedulable {
    override fun schedule(time: String): String {
        this.time = time
        return "Meeting scheduled at $time"
    }

    override fun reschedule(newTime: String): String {
        this.time = newTime
        return "Meeting rescheduled to $newTime"
    }

    fun getTime(): String {
        return time
    }
}
