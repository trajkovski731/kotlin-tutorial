package demo

fun main(args: Array<String>) {

    var myArray = arrayOf(1, 1.23, "Doug")
    println(myArray[2])
    myArray[2] = 3.14
    println(myArray[2])
    println("The size of the array is ${myArray.size}")
    var partArray = myArray.copyOfRange(0, 1)
    println("First ${myArray.first()}")
    println("${myArray.indexOf(3.14)}")

    //ARRAYS

    var sqArray = Array(5, { x -> x * x })

    println(sqArray[3])

    var arr2: Array<Int> = arrayOf(1, 2, 3)

    var arr3 = arrayOf("test", 1, 2, 3, 4, 5)


}