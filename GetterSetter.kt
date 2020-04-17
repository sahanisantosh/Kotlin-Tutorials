fun main(args: Array<String>){

    val Maria = Girl()
    Maria.age = 18
    Maria.actualAge = 18
    println("Maria Age: ${Maria.age}")
    println("Maria Acutal Age: ${Maria.actualAge}")

    val riya = Girl()
    riya.age = 35
    riya.actualAge = 35
    println("Maria Age: ${riya.age}")
    println("Maria Acutal Age: ${riya.actualAge}")
}

class Girl {
    var age: Int = 0
    get() = field
    set(value) {
        field = if(value < 18)
            18
        else if (value >= 18 && value<=30)
            value
        else
            value-3
    }

    var actualAge : Int =0
}