fun main(args: Array<String>) {

    val korea = Korea("Republic of Korea", "Seoul", "Korean")
    korea.singNationalAnthem()
    korea.printLanguage()

    val usa = USA("United States of America", "Washington D.C.", "English")
    usa.singNationalAnthem()
    usa.printLanguage()

}

// 클래스를 상속하기 위해서는 open 키워드를 사용 (기본적으로는 상속 불가능)
open class Country(val fullName : String, val capital : String, val language : String) {
    fun printFullName() {
        println("Full Name is $fullName")
    }

    fun printCapital() {
        println("Capital is $capital")
    }

    fun printLanguage() {
        println("$fullName Language is $language")
    }

    open fun singNationalAnthem() { // 오버라이딩을 위해 open 키워드 사용
        println("Start singing")
    }
}

class Korea(fullName : String, capital : String, language : String) : Country(fullName, capital, language) {
    // 오버라이딩 : 부모클래스의 함수가 자식클래스에서 각각 다르게 실행되는 것, 부모클래스의 함수를 덮어씌워주는 느낌
    override fun singNationalAnthem() {
        super.singNationalAnthem() // super 키워드를 사용하면 먼저 부모클래스의 함수 실행 후 자식클래스 함수 실행
        println("Sing Korea national anthem")
    }
}

class USA(fullName : String, capital : String, language : String) : Country(fullName, capital, language) {
    override fun singNationalAnthem() {
        super.singNationalAnthem()
        println("Sing USA national anthem")
    }
}