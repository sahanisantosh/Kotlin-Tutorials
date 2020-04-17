abstract class Persian(name: String){
    init {
        println("My name is $name")
    }
    fun displaySSN(ssn: Int){
        println("My SSN is $ssn.")
    }
    abstract fun displayJob(description: String)
}

class Teacher(name: String): Persian(name){
    override fun displayJob(description: String) {
        println(description)
    }

}

fun main(args: Array<String>){
    val jack = Teacher("Jack Smith")
    jack.displaySSN(13455)
    jack.displayJob("I'm a mathematics teacher.")

}