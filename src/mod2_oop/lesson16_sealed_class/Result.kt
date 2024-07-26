package mod2_oop.lesson16_sealed_class

sealed class Result {

    data class Success(val info: String) : Result()
    object Loading : Result()
    data class Error(val msg: String) : Result()


}