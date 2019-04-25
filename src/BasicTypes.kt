fun main(args: Array<String>) {
    val a: Int = 128
    println(a === a) // true，值相等，对象地址相等

    //经过了装箱，创建了两个不同的对象
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
	
    val notaboxedA: Int = a
    val notaanotherBoxedA: Int = a
	
	//注：Int?为对象类型，而Int为基础类型

    //虽然经过了装箱，但是值是相等的，都是10000
    println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
    println(boxedA == anotherBoxedA) // true，值相等
    println(notaboxedA === notaanotherBoxedA) //  true，基础类型的对象地址一样
    println(notaboxedA == notaanotherBoxedA) // true，值相等
	
	var bbb:String? = "12345"
	bbb = null
	println(bbb?.toInt()?.plus(1))
	
	var xxx:String? = """
     |哈哈哈
     	|啦啦啦
 |ffffff
 					|哦哦哦哦 
 """
	println(xxx?.trimMargin("|"))
}