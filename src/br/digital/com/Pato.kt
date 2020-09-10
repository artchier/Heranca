package br.digital.com

open class Pato(nome: String) : Animal(nome) {

    final override fun andar() {
        println("Estou andando como um pato")
    }

    final override fun comer(){
        println("Estou comendo como um pato")
    }
}