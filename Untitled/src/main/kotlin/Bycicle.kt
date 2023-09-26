class Bycicle(override val name: String, override val id: Int, override val capacity: Int) : Transport() {
    override fun runDiagnostic() {
        println("Диагностика запущена")
    }
    override fun Reserve(){
        println("Зарезервировано")
    }
    override fun UnReserve(){
        println("Не зарезервировано")
    }
}