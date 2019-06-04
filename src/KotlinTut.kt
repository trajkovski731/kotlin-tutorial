package demo

fun main(args: Array<String>) {
    println("test")

    val name = "Filip";

    var myAge = "30";

    var bigInt: Int = Int.MAX_VALUE;
    var smallInt: Int = Int.MIN_VALUE;

    var bigLong: Long = Long.MAX_VALUE;

    println("Biggest int: " + bigInt);
    println("Smalles int: $smallInt ");
    println("Smalles int: $bigLong ");

    var dblNum1: Double = 1.111111111111111;
    var dblNum2: Double = 1.111111111111111;

    println("Sum : " + (dblNum1 + dblNum2))

    if (true is Boolean) {
        print("true is boolean")
    }

    var letterGrade: Char = 'A';

    println("A is a Char : ${letterGrade is Char}")

    //casting
    println("3.14 to Int : " + (3.14.toInt()))
    println("A to Int : " + ('A'.toInt()))

}