package generics

fun main(){
    val vanya: PersonReader<Int> = PersonReader(367, "Vanya")
    val tanya: PersonReader<String> = PersonReader("A65", "Tanya")

    val word1 : Word<Int, String> = Word(10, "word1")
    val word2 : Word<Int, Boolean> = Word(10, true)

    /* println(vanya)
     println(tanya)
     println()
     println(word1)
     println(word2)*/

    display(10)
    display(true)
    display("Hello it's generics")

}

fun <T> display(obj: T){
    println(obj)
}

class PersonReader<T>(val id: T, val name: String) {
    override fun toString(): String {
        return "Person(id=$id, name='$name')"
    }

}

class Word<K, V>(val source: K, var target: V) //несколько параметров
{
    override fun toString(): String {
        return "Word(source=$source, target=$target)"
    }
}