class Person(){
    var name: String = "Undefined"
    var age: Int = 0


    private var _email:String = "Vincent"
    var email: String
        get() { return _email }
        set(value) { _email = value }

    constructor(_name: String, _age: Int) : this() {
        name = _name
        age = _age
    }

    fun sayHello(){
        println("Hello, my name is $name")
    }

    fun go(location: String){
        println("$name goes to $location")
    }

    fun personToString() : String{
        return "Name: $name  Age: $age"
    }

    override fun toString(): String {
        return "Person(name='$name', age=$age)"
    }
}