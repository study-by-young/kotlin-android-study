fun main(args: Array<String>) {

    /**
     * 데이터 클래스 : 데이터를 전달하려는 목적, 데이터를 보관하기 위함
     * 데이터를 저장, 사용하기 위한 함수를 자동으로 생성
     * */

    val memo = Memo("Go to grocery", "Eggs, Milk, Pork", false)
    println(memo.toString())
    println(memo.title)
    val memo2 = memo.copy("Go to home")
    println(memo2)

}

// 주생성자를 반드시 구현해야 함, val 이나 var 키워드를 사용하여 정의된 프로퍼티가 1개 이상 존재해야 함
data class Memo(val title : String, val content : String, val isDone : Boolean)