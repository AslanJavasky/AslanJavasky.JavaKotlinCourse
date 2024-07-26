package mod3_exception.lesson3_hierarchy_of_exceptions

fun main() {

    val zero = 1
//    var str: String? = "some string"
    var str: String? = null


    try {
        println("15/zero=" + 15 / zero)
        println("The length of string is " + str?.length)
//        throw NullPointerException()
        val arr = arrayOf(1, 2, 3)
//        val element=arr[15]

        val num = str?.toInt() ?: 0
        println("num=$num")
    } catch (e: NullPointerException) {
        println("The str is null.$e")
    } catch (e: NumberFormatException) {
        println(e)
    } catch (e:Exception) {
        when(e){
            is ArithmeticException -> println(e)
            is ArrayIndexOutOfBoundsException -> println("ArrayIndex Out Of Bounds: $e")
            else -> println(e)
        }
    }
    finally {
        println("The end of try-catch block")
    }

    println("The end of program!")

}