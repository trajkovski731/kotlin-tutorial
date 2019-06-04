package demo

fun main(args: Array<String>) {

    val myName = "Filip Trajkovski"
    val longStrg = """This is a long string"""

    var fName: String = "Doug"
    var lName: String = "Smith"

    fName = "Sally"

    var fullName = fName + " " + lName

    println("Name : $fullName ")
    println("1 + 2 = ${1 + 2}")

    var str1 = "A random string"
    var str2 = "A random string"

    println("Strings equal : ${str1.equals(str2)}")
    println("Compare A to B : ${"A".compareTo("B")}")

    println("2nd index: ${str1[2]}")

    val test = "aes"

    println("Contains random str1  + ${str1.contains("random")}");
}