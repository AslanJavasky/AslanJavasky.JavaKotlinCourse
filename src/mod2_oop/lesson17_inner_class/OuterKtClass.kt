package mod2_oop.lesson17_inner_class

class OuterKtClass {
    private var outerField:Int=0

    fun otherMethod(){
        println("Outer method")
    }

    inner class InnerClass{
        private val innerField:Int=0

        fun innerMethod(){
            outerField= 10;
            println("Inner method, outerField = $outerField")
            this@OuterKtClass.otherMethod()
        }

    }

}