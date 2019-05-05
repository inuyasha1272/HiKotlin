package scopeFunction

class ApplyTest {
    fun test(){
        val s = "applyTest"
        val result = s.apply {
            println("this is: $this")
            println("it is invalid")
            "hahaha apply"
        }
        println("result is: $result")
    }
}