package br.digital.com

fun main() {

    val animal = Animal("animal")

    val cachorro = Cachorro("cachorro")
    val pato = Pato("pato")
    val patolino = Patolino("patolino")

    animal.andar()
    cachorro.andar()
    pato.andar()
    patolino.patolinoAndando()
}