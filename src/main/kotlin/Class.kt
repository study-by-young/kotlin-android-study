fun main(args: Array<String>) {

    val car = Car("Blue")
    val car2 = Car("Red")
    println("Color of the car is ${car.color}")
    println("Color of the car2 is ${car2.color}")

}

class Car(val color : String)