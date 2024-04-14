package inheritance

fun main() {
    val tiger = Animal("cats", 14)
    val dog = Pet("dogs", 4, "Zhuchka")
    tiger.printInf()
    dog.printInf()
}

open class Animal(val species: String, val age: Int) {
    open fun printInf() {
        println("species: $species \n age: $age")
    }
}

class Pet(species: String, age: Int, val nickname: String) : Animal(species, age) {
    override fun printInf() {
        super.printInf()             //вызов части метода из суперкласса
        println("nickname: $nickname")
    }
}