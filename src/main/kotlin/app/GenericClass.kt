package app

import data.MyData

fun main() {
    val myDataString: MyData<String> = MyData<String>("Fedrian")
    myDataString.printData()

    val myDataInt: MyData<Int> = MyData<Int>(100)
    myDataInt.printData()
}