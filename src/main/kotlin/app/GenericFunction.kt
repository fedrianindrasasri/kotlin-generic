package app

import data.Function

fun main() {
    val function = Function("Fedrian")
    function.sayHello("Indra")
    function.sayHello(10)
    function.sayHello<Int>(100)
}