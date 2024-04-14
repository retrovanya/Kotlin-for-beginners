package abstraction
//абстрактный класс, метод, свойства

fun main(){
val ferrari = Car("car", "ferrari ff", 2)
val bmw: Machinery = Car("car", "bmw x5", 5) //динамическое создание объекта*
    ferrari.printInf()
    bmw.printInf()
}
abstract class Machinery(val name: String) {
open fun printInf() {
    println("name of this mechanism is $name")
}
    abstract var age: Int
    abstract fun utilization()
}

class Car(name: String, val model: String, override var age: Int) : Machinery(name) {
    override fun printInf() {
        super.printInf()
        println("model of this car is $model \nage of this car is $age")
    }
    override fun utilization() {
        println("this car is scrapped")
    }

}


