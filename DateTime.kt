import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(args: Array<String>){

//    val current = LocalDateTime.now()
//    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SS")
//    val formatted = current.format(formatter)
//    println("Current Data and Time is: $formatted")


    val path = System.getProperty("user.dir")
    println("Working Directory = $path")
}


