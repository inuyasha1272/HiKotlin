package staticTest

class Utils3 {

    companion object{
        fun pLog3(str: String){
            println(str)
        }

        @JvmStatic
        fun pLog4(str: String){
            println(str)
        }
    }
}