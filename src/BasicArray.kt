fun main(args: Array<String>) {
    val arrayWithMembers = createArrayWithMembers()

    arrayWithMembers[3] = 123.0f
    //遍历数组元素
    for (i in arrayWithMembers.indices){
        when(arrayWithMembers[i]){
            is String -> println("第$i 个元素是 ${arrayWithMembers[i]} :String")
            is Int -> println("第$i 个元素是 ${arrayWithMembers[i]} :Int")
            is Float -> println("第$i 个元素是 ${arrayWithMembers[i]} :Float")
        }
    }

    //遍历数组下标
    for (x in arrayWithMembers.indices){
        println("arrayWithMembers.indices is $x")
    }
}

//创建数组（3种方法），空数组，访问元素，遍历数组，检查下标

//方式1：创建长度为0的空数组
fun createEmptyArray():Array<Int>{
    return emptyArray()
}

//方式2：创建固定长度的元素为null的数组
fun createArrayWithLength(arrayLength:Int){
    val arrayOfNulls = arrayOfNulls<Int>(arrayLength)
}

fun createArrayWithMembers():Array<Any>{
    return arrayOf("1",2,3,4,5)
}
