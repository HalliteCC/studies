// Abstração: Criamos uma classe abstrata que define um modelo comum
abstract class Animal(val nome: String) {
    abstract fun fazerSom()
}

// Herança: A classe Cachorro herda de Animal
class Cachorro(nome: String, private val raca: String) : Animal(nome) {
    // Encapsulamento: 'raca' é privada e só pode ser acessada por métodos dentro da classe
    fun getRaca(): String {
        return raca
    }

    override fun fazerSom() {
        println("$nome (Raça: $raca) late: Au Au!")
    }
}

class Gato(nome: String) : Animal(nome) {
    override fun fazerSom() {
        println("$nome mia: Miau!")
    }
}

// Polimorfismo: Podemos tratar diferentes classes como sua superclasse
fun emitirSom(animal: Animal) {
    animal.fazerSom()
}

fun main() {
    val cachorro = Cachorro("Rex", "Labrador")
    val gato = Gato("Mimi")

    // Encapsulamento: Usamos um método para acessar o dado privado
    println("Raça do cachorro: ${cachorro.getRaca()}")

    // Polimorfismo: Podemos chamar o mesmo método para diferentes classes
    emitirSom(cachorro)
    emitirSom(gato)
}