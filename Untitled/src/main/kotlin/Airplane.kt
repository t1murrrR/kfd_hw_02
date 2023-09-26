class Airplane(override val name: String, override val id: Int, override val capacity: Int) : Transport(){
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }
    override fun startEngine() {
        println("Двигатель запущен")
    }
    override fun stopEngine() {
        println("Двигатель выключен")
    }
    fun Flight(){
        println("Взлёт")
    }
}