package app

class Contravariant<in T> {
    fun sayHello(param:T){
        println("Hello $param")
    }
}

fun main(){
    val contravariantAny = Contravariant<Any>()
    val contravariantString : Contravariant<String> = contravariantAny

    contravariantString.sayHello("Fedrian")
}