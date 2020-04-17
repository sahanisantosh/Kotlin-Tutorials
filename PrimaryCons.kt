import javax.lang.model.type.NullType

fun main(args: Array<String>){

    /*val p1 = Person("Santosh Sahani", 22)
    println("Name : ${p1.firstName}")
    println("Age : ${p1.age}")*/

//    val P1= Person("Santosh", 22)

    val P1 = Person("Santosh", 22)
    val P2 = Person()
    val P3 = Person("Sahani",22)

}

/*
class Person(val fName: String, var personAge: Int){
    val firstName: String
    var age: Int
    init {
        firstName = fName.capitalize()
        age = personAge
        println("First Name: $firstName")
        println("Age: $age")
    }
}*/

class Person(_firstName: String = "UNKNOWN" , _age: Int =0) {
    val firstName = _firstName.capitalize()
    var age = _age

    init {
        println("First Name: $firstName")
        println("Age: $age")
    }
}
