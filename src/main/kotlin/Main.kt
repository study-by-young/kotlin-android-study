fun main(args: Array<String>) {

    /**
     * 변수 선언 : 컴퓨터 메모리에 값을 넣을 공간을 확보하는 것
     * 자료형을 사용하는 이유 : 사용하는 변수의 데이터 크기에 맞게 메모리를 할당해서 효율적으로 사용하기 위함
     * */

    val pi : Double = 3.14 // 상수
    println(pi)

    var age : Int = 31 // 변수
    println(age)
    age = 30
    println(age)

    var mByte : Byte = 100
    var mShort : Short = 10000

    var mChar : Char = 's'
    var mString : String = "lion"

    var mArray : Array<String> = arrayOf("Sam", "sung", "Lions")
    println(mArray[0] + mArray[1] + mArray[2])
    println(mArray.get(0))
    println(mArray.size)

}