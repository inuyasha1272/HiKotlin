package thread

import java.util.concurrent.locks.ReentrantLock
import kotlin.concurrent.withLock

class player1 {
    private val lock = ReentrantLock()
    private val condition = lock.newCondition()

    var num:Int = 0

    var isJishuTurn:Boolean = false

    fun printJishu(){
        lock.withLock {
            while(!isJishuTurn){
                condition.await()
            }
            println("$num with thread : ${Thread.currentThread().name}")
            num++
            isJishuTurn = !isJishuTurn
            condition.signalAll()
        }
    }

    fun printOushu(){
        lock.withLock {
            while(isJishuTurn){
                condition.await()
            }
            println("$num with thread : ${Thread.currentThread().name}")
            num++
            isJishuTurn = !isJishuTurn
            condition.signalAll()
        }
    }
}

fun main(args: Array<String>) {
    val player1 = player1()
    Thread(Runnable {
        while(player1.num < 100){
            player1.printJishu()
        }
    }).start()

    Thread(Runnable {
        while(player1.num < 100){
            player1.printOushu()
        }
    }).start()
}