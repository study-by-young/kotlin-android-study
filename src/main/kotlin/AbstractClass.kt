fun main(args: Array<String>) {

    val mapleStory = MapleStory()
    mapleStory.startGame()
    mapleStory.printGameName()

}

abstract class Game {
    fun startGame() {
        println("Start Game")
    }

    abstract fun printGameName()
}

class MapleStory : Game() {

    override fun printGameName() {
        println("This is MapleStory")
    }

}