package app

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringLogReadWriteProperty(var data: String) : ReadWriteProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get Property ${property.name}")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set Property ${property.name}")
        data = value
    }
}

class Person(param: String) {
    var name: String by StringLogReadWriteProperty(param)
}

fun main() {
    val person = Person("Fedrian")
    println(person.name)
    person.name = "Indra"
    println(person.name)
}