import com.sun.org.apache.xpath.internal.operations.Bool
import java.util.*

fun main(args: Array<String>){
    /*val a = 12
    val b = 13
    val max: Int

    max = if(a > b) a else b
    println(max)*/

//    val number = -10
////    val result = if (number > 0 ){
////        "positive number"
////    } else {
////        "negative number"
////    }
////    println(result)
//
//    val result = if (number > 0) "positive number" else "negative number"
//    print(result)

//    val a = -9
//    val b = -11
//
//    val max = if(a > b) {
//        println("$a is greater the $b")
//        println("max variable hold the value of a.")
//        a
//    } else{
//        println("$b is larger then $a.")
//        println("max variable holds value of b.")
//        b
//
//
//    }
//    println("max = $max")


   /* while (true) {
        val a = 12
        val b = 5

        println("Enter operator either +, -, *, / : ")
        val operator = readLine()
        val result = when (operator) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> "$operator in invalid operator."
        }
        println(result)
    }*/

//    val a= 12
//    val b= 5
//
//    println("Enter operator either +, -, *, / : ")
//    val operator = readLine()
//    when(operator){
//        "+" -> println("a + b : ${a+b}")
//        "-" -> println("a - b : ${a-b}")
//        else -> println("Invalid")
//    }


//    for(i in 20..200 step 20){
//        println(i)
//    }

//    var language = arrayOf("Hindi","English","Marathi","Gujrati","Bengali")
//    for (item in language.indices) {
//        if(item%2 ==0){
//            println(language[item])
//        }
//    }
//    val number = 5.5
//    print("Result = ${Math.sqrt(number)}")
//    callMe()
//    println("Printing from outside of callMe function")

//    val result = addNumber(12.2,12.5)
//    println(result)

//    print(getName("Santosh","Sahani"))

    val a = true
    val b = false

    var result: Boolean
    result=a or b
    println(result)
    result=a and b
    println(result)

}

//fun callMe(){
//    println("Printing from callMe() function.")
//    println("This is cool still printing from the callMe() Function")
//}
//fun addNumber(n1: Double, n2: Double): Int {
//    val sum = n1+n2
//    val sumInteger = sum.toInt()
//    return sumInteger
//}

//fun getName(firstName: String, lastName: String) = "$firstName $lastName"