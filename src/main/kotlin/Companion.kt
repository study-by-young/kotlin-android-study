fun main(args: Array<String>) {

    /**
     * 싱글톤 패턴 : 클래스의 인스턴스가 오직 하나만 생성됨
     * */

//    println(MyFirstObject.number)
//    MyFirstObject.sayHello()

    println(Dinner.MENU)
    Dinner.eatDinner()

}

object MyFirstObject {
    val number = 1
    fun sayHello() {
        println("Hello!")
    }
}

class Dinner {
    // Companion Object : 클래스 안에 들어있는 오브젝트, 단 하나만 존재할 수 있음
    val lunch = "steak" // companion object 안에 들어있지 않기 때문에 외부에서 사용할 수 없음
    companion object {
        val MENU = "pasta"
        fun eatDinner() {
            println("Today's Menu is $MENU")
        }
    }
}