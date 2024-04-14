package interfaces

class Car(private val name: String) : Movable{
    override fun move() {
        println("car $name rides by wheels")
    }

}
class Aircraft(private val name: String) : Movable{
    override fun move() {
        println("plane $name flies on wings")
    }

}