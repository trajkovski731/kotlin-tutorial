package demo

fun main(args: Array<String>) {
    val age = 8
    /* if (age < 5) {
         println("Fuck you it's stupid")
     } else if (age == 5) {
         println("Again stupid")
     } else if ((age > 5) && (age <= 17)) {
         val grade = age - 5;
         println("Go to grade $grade")
     }*/

    when (age) {
        0, 1, 2, 3, 4, 8 -> println("Go to Preschool")
    }

}