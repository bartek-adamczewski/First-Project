fun zad1() {
    println("Podaj pierwszą liczbę: ")
    val firstNumber = readLine()!!.toFloat()
    println("Podaj drugą liczbę: ")
    val secondNumber = readLine()!!.toFloat()
    println("Podaj operację którą chcesz na nich wykonać: ")
    val operation = readLine()!!

    when {
        operation == "/" && secondNumber != 0f -> println(firstNumber / secondNumber)
        operation == "/" && secondNumber == 0f -> println("Pamiętaj cholero, nie dziel przez zero")
        operation == "*" || operation == "x" -> println(firstNumber * secondNumber)
        operation == "+" -> println(firstNumber + secondNumber)
        operation == "-" -> println(firstNumber - secondNumber)
        else -> println("nie znane działanie matematyczne")
    }
}