package mod10_design_pattern.lesson11_proxy.kotlin

class ProxyLibrary(private val userRole:String) : Library {

    private val realLib=RealLibrary()

    private val hasAccess:Boolean
        get() = userRole == "student" || userRole == "professor"

    override fun accessBook(bookName: String) {
        if (hasAccess){
            realLib.accessBook(bookName)
        }else{
            println("Access denied to the the book: $bookName. Unsufficient permissions.")
        }
    }
}