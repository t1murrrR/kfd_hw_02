fun main(){
    val BusTransport = Bus("Автобус", 1, 35)
    val AirplaneTransport = Airplane("Самолёт", 2, 200)
    val BycicleTransport = Bycicle("Велосипед", 3, 1)
    val CarTransport = Car("Автомобиль",4, 5 )
    println("Введите вид транспорта:")
    println("Автобус - 1")
    println("Самолёт - 2")
    println("Велосипед - 3")
    println("Автомобиль - 4")
    val MyTransport: String = readln().toString()
    if( MyTransport == "1") {
        println("Вместимость: ${BusTransport.capacity}")
        BusTransport.Reserve()
        BusTransport.startEngine()
    }
    if( MyTransport == "2") {
        println("Вместимость: ${AirplaneTransport.capacity}")
        AirplaneTransport.Reserve()
        AirplaneTransport.startEngine()
        AirplaneTransport.Flight()
    }
    if( MyTransport == "3") {
        println("Вместимость: ${BycicleTransport.capacity}")
        BusTransport.Reserve()
        BycicleTransport.startEngine()

    }
    if( MyTransport == "4") {
        println("Вместимость: ${CarTransport.capacity}")
        CarTransport.Reserve()
        CarTransport.startEngine()
    }
    if(MyTransport != "1" && MyTransport != "2" && MyTransport != "3" && MyTransport != "4" ){
        println("Ошибка")
    }
}