fun main(args: Array<String>){
    val P1 = Person2(22,"Santosh Sahani")
    val M1= MathTeacher(25,"XYZ")
    M1.teachMaths()
    val F1= Footballer(30,"Ronaldo")
    F1.playFootball()
}

open class Person2(age: Int, name:String){
    init {
        println("My name is ${name}")
        println("My age is $age")
    }
}
class MathTeacher(age: Int, name: String) : Person2(age, name){
    fun teachMaths(){
        println("I teach in primary school.")
    }
}

class Footballer(age: Int, name: String): Person2(age, name) {
    fun playFootball(){
        println("I play Football.")
    }
}