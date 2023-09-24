fun main(args: Array<String>) {

    /**
     * Function Basic Structure
     * *----------------------------------------------------*
     * | fun FUNCTION_NAME ( PARAMETER ) : RETURN_TYPE {    |
     * |        // CODES TO RUN                             |
     * |    }                                               |
     * *----------------------------------------------------*
     * */

    printStudentInfo("Koo", 31)
    println(addNumber(100, 1000))

}

// return 값이 없으면 Unit (생략 가능)
fun printStudentInfo(name : String, age : Int) : Unit {
    println("Student Name : $name")
    println("Student Age : $age")
}

// return 값이 있으면 자료형 작성
fun addNumber(n1 : Int, n2 : Int) : Int {
    return n1 + n2
}