package mod2_oop.lesson16_sealed_class

import mod2_oop.lesson16_sealed_class.Result

fun main() {

    val loadingResult:Result = Result.Loading
    val successResult:Result = Result.Success("Downloaded 29/30")
    val errorResult:Result = Result.Error("error code : 404")

    handleResult(loadingResult)
    handleResult(successResult)
    handleResult(errorResult)

}

fun handleResult(result: Result){
    when(result){
        is Result.Error -> println("Error: ${result.msg}")
        Result.Loading -> println("Loading ...")
        is Result.Success -> println("Success: ${result.info}")
    }
}