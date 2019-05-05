package scopeFunction

class AlsoTest {
    fun test(){
        val s = "alsoTest"
        val result = s.also {
            println("this is: $this")
            println("it is: $it")
            "hahaha"
        }
        println("result is: $result")
    }
}