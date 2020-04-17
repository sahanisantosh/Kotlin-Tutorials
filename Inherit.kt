open class Personp(){
    open fun displayAge(age: Int){
        println("My actual Age is $age")
    }

}
class Girl1: Personp(){
    override fun displayAge(age: Int){

        super.displayAge(age)
        println("My fake age is $age")
    }
}

fun main(args: Array<String>){
    val girl = Girl1()
    girl.displayAge(30)
}