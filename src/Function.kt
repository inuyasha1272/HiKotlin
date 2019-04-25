//函数
fun main(args: Array<String>) {
	println(sum2(10,20))
	println(sum1(10,20))
	println(sum3(10,20))
	
	println(multiply1(7,6))
	println(multiply2(8,6))
	println(sssuuummm(1,2,3,4,5))
	
	val sumLambda:(Int, Int) -> Int = {x,y -> x+y}
	println("test lambda: sum"+sumLambda(1,2))
}

/***************有返回值的函数 start ****************/

//入参是2个Int,返回值的类型是Int：
public fun sum1(a:Int, b:Int):Int{
	return a+b
}

//它还能这么写
public fun sum2(a:Int, b:Int):Int = a+b

//它还能更简单：(返回类型自动判断为Int)
public fun sum3(a:Int, b:Int) = a+b

/***************有返回值的函数 end****************/

/***************无返回值的函数 start ****************/

//返回值为kotlin.Unit的函数即无返回值函数（类似Java中的void）, Unit可以省略

fun multiply1(a:Int, b:Int):Unit{
	println(""+a+"*"+b+"="+a*b);
}

fun multiply2(a:Int, b:Int){
	println(""+a+"*"+b+"="+a*b);
}

/***************可变参数的函数 end****************/

//关键词 vararg
fun sssuuummm(vararg a:Int){
	for(i in a){
		print(i)
	}
}

/***************可变参数的函数 start ****************/




