//data классы по умолчанию имеют методы toString(), equals(), hashCode(), copy
fun main(){
    val house_one = House("Toronto", "bricks", 13, 4)
println(house_one)
}
data class House(val city: String, val material: String, val age: Int, val numberOfRooms: Int) {}