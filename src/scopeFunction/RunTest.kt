package scopeFunction

class RunTest {
    fun test(){
        val s = "runTest"
        val result = s.run {
            println("this is: $this")
            println("it is invalid")
            "hahaha run"
        }
        println("result is: $result")
    }
}