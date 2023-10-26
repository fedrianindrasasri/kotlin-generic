package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperty(val data: String) : ReadOnlyProperty<Any, String> {
    var counter: Int = 0
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access Property ${property.name} with value $data")
        counter++
        return data.toUpperCase() + " " + counter
    }
}

class NameWithLog(param: String) {
    val name: String by LogReadOnlyProperty(param)
}

fun main() {
    val nameWithLog = NameWithLog("Fedrian")
    println(nameWithLog.name)
    println(nameWithLog.name)
}