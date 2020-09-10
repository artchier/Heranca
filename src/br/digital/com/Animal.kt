package br.digital.com

open class Animal(var nome: String) {

    open fun comer() {
        println("Estou comendo")
    }

    open fun andar(){
        println("Andando")
    }
}