package Loops

//You have a program that counts pizza slices until there’s a whole pizza with 8 slices. Refactor this program in two ways:
//Use a while loop.
//Use a do-while loop.

fun main() {
    var pizzaSlices = 0

    //Example using just While
    while(pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")


    //Example as Do-While
    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }while (pizzaSlices < 7)
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}