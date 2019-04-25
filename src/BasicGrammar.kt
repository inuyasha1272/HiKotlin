fun main(args: Array<String>) {
	/**
		$a 表示一个变量a值
		${fun()}表示fun函数的返回值
	*/
	
	var a = 22
	
	var s1 = "a is $a"
	
	a = 11
	println("${s1.replace("is","was")},but now is $a")
	
	//null检查机制
	
	//类型后面加?表示，该变量可以为null；不加?则表示该变量不能为null
	
	//变量后面的?表示：变量为null时则执行:后的表达式 或者 给变量：后的值
	var age:String = "23"
	
	var testNull:String? = null
	
	println(testNull?:Unit)
	
	//定义一个ArrayList<String>
	var domains:ArrayList<String>? = ArrayList<String>()
	    domains = null
	    //当domains? = null 时， domains?的调用都不会执行，并且返回值都为null
        println(domains?.add("haha0"))
        domains?.add("haha1")
	//当domains? = null 时，（size的返回值是Int）返回值为null
	println(domains?.size)
	
	// .. 是 1-10 包含10
	for(i in 1..10){
		print("$i ")
	}
	
	println()
	// downTo 是 10-1 包含1
	for(i in 10 downTo 1){
		print("$i ")
	}
	
	println()
	// util 是 1-11 不包含11	//step: 每隔x个取一个数
	for(i in 1 until 11 step 2){
		print("$i ")
	}
	
	println()
	
	for(i in 11 downTo 1 step 2){
		print("$i ")
	}
	
	
}
