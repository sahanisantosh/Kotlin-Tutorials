import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>) {
    val num1 = 12.5
    val num2 = 3.5
    var result: Double

    result = num1 + num2
    println("Number 1 + Number 2: $result")

    result = num1 - num2
    println("Number 1 - Number 2: $result")

    result = num1 * num2
    println("Number 1 * Number 2: $result")

    result = num1 / num2
    println("Number 1 / Number 2: $result")

    result = num1 % num2
    println("Number 1 % Number 2: $result")


    val start = "Talk is cheap. "
    val middle = "Show me the code. "
    val end = " - Linus Torvalds"

    val result1 = start + middle + end
    println(result1)


    val numbers = intArrayOf(1, 4, 42, -3)
    for (n in numbers) {
        println(n)
    }


    val name: Float = 15.21F
    val num: Int = name.toInt()
    println(name)
    println(num)


}
