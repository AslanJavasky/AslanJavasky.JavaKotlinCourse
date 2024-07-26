package mod2_oop.lesson14_functional_interface


fun main() {

//    val englishGreeting: (String) -> Unit = { name -> println("Hello, $name!") }
//    englishGreeting("Aslan Javasky")

    //anonymous object
    object : GreetingKt {
        override fun sayHello(name: String) {
            println("Hello, $name!")
        }
    }.sayHello("Aslan Javasky")


}

