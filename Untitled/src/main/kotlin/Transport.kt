abstract class Transport: Movable, Reservation{

    abstract val name: String
    abstract val id: Int
    abstract val capacity: Int

    abstract fun runDiagnostic()
}

