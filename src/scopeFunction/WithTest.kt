package scopeFunction

class WithTest {
    fun test(){
        val s = "withTest"
        val result = with(s) {
            println("this is: $this")
            println("it is invalid")
            "result has changed"
        }
        println("result is: $result")
    }
}