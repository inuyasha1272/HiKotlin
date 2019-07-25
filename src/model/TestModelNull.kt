package model

fun main(args: Array<String>) {

    val entity:ClassEntity = ClassEntity().apply {
        this.data = Animal()
        this.message = "test1"
    }
    val classEntityCopy = entity.copy()
    println("entity animal name:${entity?.data?.name}")

    println(entity == classEntityCopy)

    println(entity === classEntityCopy)

    entity.showMessage()

}
val ClassEntity.name: String?
    get() = this.message

fun ClassEntity.showMessage(){
    println("message is %s".format(name))
}
