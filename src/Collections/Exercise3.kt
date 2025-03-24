package Collections

//Define a map that relates integer numbers from 1 to 3 to their corresponding spelling. Use this map to spell the given number.

fun main() {
    val number2word = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val n = 3
    println("$n is spelt as '${number2word[n]}'")
}