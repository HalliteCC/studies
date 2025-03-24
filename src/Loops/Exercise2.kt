package Loops

//Write a program that simulates the Fizz buzz game. Your task is to print numbers from 1 to 100 incrementally,
// replacing any number divisible by three with the word "fizz",
//and any number divisible by five with the word "buzz". Any number divisible by both 3 and 5 must be replaced with the word "fizzbuzz".

fun main() {
    for(number in 1..100){
        val result = when {
            number % 15 == 0 -> "FizzBuzz"
            number % 5 == 0 -> "Buzz"
            number % 3 == 0 -> "Fizz"
            else -> "$number"
        }
        println(result)
    }

}