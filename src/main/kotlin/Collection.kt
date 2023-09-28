fun main(args: Array<String>) {

    /**
     * Collection
     * 1. List : 순서 O
     * 2. Set : 순서 X, 중복 불가능
     * 3. Map
     * */

    // 1. List
    // Immutable List : 읽기 전용 리스트
    val fruitList = listOf("Banana", "Apple", "Melon")
    println("First fruit is ${fruitList[0]}")
    // Mutable List : 수정/추가/삭제 가능한 리스트
    val mutableFruitList = mutableListOf("Mango", "Lemon", "Melon")
    println("First mutable fruit is ${mutableFruitList[0]}")
    mutableFruitList[0] = "Strawberry"
    println("First mutable fruit (new) is ${mutableFruitList[0]}")
    println(mutableFruitList)
    //Iterable
    mutableFruitList.forEach { fruit ->
        println("My Fruit List : $fruit")
    }

    // 2. Set
    // Immutable Set
    val immutableNumSet = setOf(1, 1, 2, 2, 3, 3, 3, 4)
    println("immutableNumSet is $immutableNumSet")
    // Mutable Set
    val mutableNumSet = mutableSetOf(1, 1, 2, 2, 3, 4, 5, 6)
    println("mutableNumSet is $mutableNumSet")
    mutableNumSet.add(100)
    println("mutableNumSet (add) is $mutableNumSet")
    mutableNumSet.remove(1)
    println("mutableNumSet (remove) is $mutableNumSet")
    println(mutableNumSet.contains(1))

    // 3. Map
    // Immutable Map
    val immutableMap = mapOf("name" to "Koo", "age" to 31, "height" to 190)
    println("immutableMap name is ${immutableMap["name"]}")
    // Mutable Map
    val mutableMap = mutableMapOf("name" to "Koo", "age" to 31, "height" to 190)
    println("mutableMap age is ${immutableMap["age"]}")
    mutableMap["age"] = 20
    println(mutableMap)
    mutableMap.put("hobby", "coding")
    mutableMap.remove("age")
    mutableMap.replace("name", "kim")
    println("mutableMap is $mutableMap")

}