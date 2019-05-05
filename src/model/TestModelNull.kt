package model

fun main(args: Array<String>) {

    val entity:ClassEntity = ClassEntity().apply {
        this.data = null
        this.message = "test1"
    }

    println("entity animal name:${entity?.data?.name}")


}