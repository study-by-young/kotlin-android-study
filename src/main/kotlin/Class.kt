fun main(args: Array<String>) {

    val car = Car("Blue", "Volvo", 13)
    val car2 = Car("Red", "Hyundai", 15)
//    println("Color of the car is ${car.color}")
//    println("Color of the car2 is ${car2.color}")

    val car3 = Car("Yellow", "Tesla")
    val car4 = Car("Silver", "Honda")

}

class Car(val color : String, val name : String, val age : Int) /* 주생성자 */ {
    init {
        // 맨 처음 객체가 생성될 때 실행될 내용
        println("Color : $color, Name : $name, Age : $age")
    }

    // 보조생성자 : 주생성자 보완
    constructor(color : String, name : String) : this(color, name, 12) {
        println("Secondary constructor is called!")
    }
}