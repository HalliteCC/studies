package Classes

fun main() {
    val ebook = Ebook("Percy Jackson", "Rick Riordan", 32)
    ebook.information()
    ebook.download()
    ebook.read()
}

open class Book(var title: String, var author: String) {
    open fun information() {
        println("O livro $title tem $author como autor")
    }

    open fun read() {
        println("Você está lendo o livro: $title")
    }
}

class Ebook(title: String, author: String, private val fileSize: Int) : Book(title, author) {

    override fun information() {
        println("O eBook $title de $author tem um tamanho de $fileSize MB.")
    }

    override fun read() {
        println("Você está lendo o eBook $title.")
    }

    fun download() {
        println("Baixando $title, tamanho do arquivo: $fileSize MB")
    }
}