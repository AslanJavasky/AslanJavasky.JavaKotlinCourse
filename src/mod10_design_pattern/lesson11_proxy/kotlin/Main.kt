package mod10_design_pattern.lesson11_proxy.kotlin

fun main() {

    val lib: Library = ProxyLibrary("student")
//    val lib: Library = ProxyLibrary("mathematic")
    lib.accessBook("Defence Against the Dark Arts")
}