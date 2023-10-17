fun main(args: Array<String>) {

    // Lambda Expression : 값처럼 다룰 수 있는 익명함수
    // 람다식 자체가 함수의 인수 및 리턴값이 될 수 있음

    val sayHello = fun() { println("Hello!") } // 익명함수 : 이름이 없는 함수
    sayHello()

    // 인수로 넣은 값의 제곱을 반환하는 함수
    val squareNum : (Int) -> (Int) = { num -> num * num }
    println(squareNum(10))
    val squareNum2 = { num : Int -> num * num }
    println(squareNum2(30))
    val squareNum3 : (Int) -> (Int) = { it * it } // 인수가 하나일 때 it 사용 가능 (인수를 it 이라고 표현)
    println(squareNum3(30))

    // 람다를 인수로 사용 가능
    fun invokeLambda(lambda : (Int) -> Boolean) : Boolean {
        return lambda(5)
    }

    val falseValue = invokeLambda { num -> num == 10 }
    println(falseValue)
    val trueValue = invokeLambda { num -> num < 10 }
    println(trueValue)

    // 전부 동일
    invokeLambda { num -> num < 10 }
    invokeLambda({ it < 10 })
    invokeLambda() { it < 10 }
    invokeLambda { it < 10 }


    fun testLambda(num : Int, lambda : (Int) -> (Int)) : Int {
        return num * lambda(10)
    }
    val testValue = testLambda(3) { it * it } // 300
    println(testValue)

    fun testLambda2(lambda : (Int, Int) -> (Int)) : Int {
        return lambda(5, 15)
    }
    val testValue2 = testLambda2 { x : Int, y : Int -> x + y } // 20
    println(testValue2)

}