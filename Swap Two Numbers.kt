fun main(args: Array<String>){
    var first = 5
    var second = 10

    println("***Before Swap***")
    println("First number = $first")
    println("Second number = $second")

    first = first - second
    second = first+ second
    first = second - first

    println("***After Swap***")
    println("First number = $first")
    println("Second number = $second")
}