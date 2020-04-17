fun main(args: Array<String>){
//    val number = 4
    val result: Long

    println("Enter Number: ")
    val number = readLine()

    result = factorial(number!!.toInt())
    println("Factorial of $number is: $result")
}

fun factorial(number: Int): Long {
    return if(number ==1) number.toLong() else number*factorial(number -1)

}
