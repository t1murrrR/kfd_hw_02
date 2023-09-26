class Car(override val name: String, override val id: Int, override val capacity: Int): Transport() {
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }
    override fun startEngine() {
        println("Двигатель запущен")
    }
    override fun stopEngine() {
        println("Двигатель выключен")
    }
    override fun Reserve(){
        println("Зарезервировано")
    }
    override fun UnReserve(){
        println("Не зарезервировано")
    }
}