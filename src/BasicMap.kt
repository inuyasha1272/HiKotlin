fun main(args: Array<String>) {
    //Map 没有put函数，也就无法修改元素
    var noneChangeMap = getNoneChangeMap()
    //HashMap  可以修改元素
    var canChangeMap = getCanChangeMap()
    canChangeMap.put(1,"ooonnneee")
    println(canChangeMap)

    val value = canChangeMap.getOrDefault(5, "hahaha")
    println(value)

    //遍历map的key、value
    for((k,v) in noneChangeMap){
        println("key : $k, value : $v")
    }
    //遍历map的key:
    for(k in noneChangeMap){
        println(k.key)
    }
    //遍历map的value
    for(v in canChangeMap){
        println(v.value)
    }

    //遍历value
    val values = canChangeMap.values
    for(v in values){
        println("values:"+v)
    }
    //遍历key
    val keys = canChangeMap.keys
    for(k in keys){
        println("keys:"+k)
    }

}

private fun getNoneChangeMap(): Map<Int, String> {
    return mapOf(1 to "one", 2 to "two", 3 to "three")
}

private fun getCanChangeMap(): HashMap<Int, String> {
    return hashMapOf(1 to "one", 2 to "two", 3 to "three")
}