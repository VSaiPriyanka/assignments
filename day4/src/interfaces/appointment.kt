package interfaces

class Appointment(private var time: String) : Schedulable {
    override fun schedule(time: String): String {
        this.time = time
        return "Appointment scheduled at $time"
    }

    override fun reschedule(newTime: String): String {
        this.time = newTime
        return "Appointment rescheduled to $newTime"
    }
}