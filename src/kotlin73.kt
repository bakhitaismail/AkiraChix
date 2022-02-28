fun main() {
    var currentYear = "2022"
    var age = "22"
    var x = add(10, 30, 20)
    println(x)
    var y = multiplication(15, 2, 10)
    println(y)
    println(currentYear)
    println("${age}")
    var statement = "I am _ years old"
    println("I am ${age} years old")
    subtraction(2022, 2000)

}
fun add(num1: Int, num2: Int, num3: Int): Int {
    var sum = num1+num2+num3
    return sum
}
fun multiplication(num1: Int, num2: Int, num3: Int): Int {
    var product = num1*num2*num3
    return product
}
fun currentYear() {
    println("2022")

}
fun statement() {
    println("I am _ years old")
}
fun subtraction(year1: Int, year2: Int) {
    var sub = year1-year2
    println(sub)
    println("I am " +sub+ " years old ")

}