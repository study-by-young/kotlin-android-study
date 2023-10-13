fun main(args: Array<String>) {

    val bike = Bike()
    bike.drive()
    bike.stop()
    bike.destroy()
    bike.showMeColor()

    val bus = Bus()
    bus.drive()
    bus.stop()
    bus.destroy()

}

interface Vehicle {
    // 인터페이스를 구현하는 모든 클래스들은 반드시 인터페이스 내에 있는 함수를 구현해야 함 (디폴트 함수는 예외)
    fun drive()
    fun stop()
    fun destroy() { println("Vehicle is destroyed!") } // 디폴트 함수
}

interface Color {
    fun showMeColor()
}

class Bike : Vehicle, Color { // 다중 인터페이스 구현
    override fun drive() {
        println("Bike is moving")
    }

    override fun stop() {
        println("Bike is stopping")
    }

    override fun destroy() {
        super.destroy()
        println("The vehicle is bike")
    }

    override fun showMeColor() {
        println("Blue color")
    }
}

class Bus : Vehicle {
    override fun drive() {
        println("Bus is moving")
    }

    override fun stop() {
        println("Bus is stopping")
    }
}