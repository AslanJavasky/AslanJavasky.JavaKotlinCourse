package mod9_algorithms.lesson12_prime_numbers

object PrimeNumbers {

    var primes = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71)


    fun isPrime(number: Int): Boolean {
        if (number > 1 && number <= 3) return true
        for (i in 2 until number) {
            if (number % i == 0) return false
        }
        return true
    }
}

fun main() {
    println(PrimeNumbers.isPrime(4))//false
    println(PrimeNumbers.isPrime(7))//true
    println(PrimeNumbers.isPrime(13))//true
    println(PrimeNumbers.isPrime(23))//true
    println(PrimeNumbers.isPrime(42))//false
}