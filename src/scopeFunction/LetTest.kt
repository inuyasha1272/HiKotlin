package scopeFunction

class LetTest {
    fun test(){
        val s = "letTest"
        val result = s.let {
            println("this is: $this")
            println("it is $it")
            "hahaha let"
        }
        println("result is: $result")
    }
}