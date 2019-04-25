package model

fun main(args: Array<String>) {
    //apply 函数中的this指的是对象本身，
    val entity:ClassEntity = ClassEntity().apply {
        this.data = Animal().apply {
            this.name = "dog1"
            this.age = 11
        }
        this.message = "test1"
    }

    println("apply:$entity")


}