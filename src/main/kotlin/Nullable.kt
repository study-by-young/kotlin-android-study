fun main(args: Array<String>) {

    /**
     * Nullable vs Non-Nullable
     * Nullable : Null 이 될 수 있는 타입
     * Non-Nullable : Null 이 될 수 없는 타입 (Default)
     * */

    var myName : String = "Koo"
    println(myName.reversed())

    // Nullable ?
    var nullableMyName : String ? = null
//    println(nullableMyName.reversed()) // nullable 한 값은 함수 사용 불가능
    // 세이프 콜 연산자 ?
    // 값이 null 일 때 null 반환
    println(nullableMyName?.reversed())

    // 엘비스 연산자 ?:
    // 값이 null 일 때 반환할 값을 지정할 수 있음
    val koo = nullableMyName?.reversed() ?: "Anonymous"
    println("koo : $koo")

    // 확정 연산자 !!
    println(nullableMyName!!.reversed()) // NullPointerException

}