class KotlinClass1 {
    private var private_int = 0
    var normal_int = 1
    public var public_int = 2
}

class KotlinClass2 {
    private var private_int = 0
    var normal_int = 1
    public var public_int = 3
}

fun main(args: Array<String>) {
    val clazz = KotlinClass1()
    println(clazz.public_int)

    println(compareStringLength1("hahaha", "haha"))
    println(compareStringLength2("hahaha", "haha"))
}

fun compareStringLength1(a:String, b:String):Boolean{
    return a.length > b.length
}

fun compareStringLength2(a:String, b:String):Boolean = a.length > b.length