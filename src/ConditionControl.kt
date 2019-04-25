class ConditionControl {
	
}


fun main(args: Array<String>) {
	println(whichIsMore(1,5))
	println(isInQujian(10))
	
	printDigital(4)
}

// if-else 作为表达式
fun whichIsMore(a:Int, b:Int):Int{
	return if (a > b) a else b
}

//if - in
//判断是否在1-9的范围里
fun isInQujian(a:Int):Boolean{
	return if(a in 1 until 10) true else false
}

//when的使用
fun printDigital(a:Int){
	when(a){
		1 -> print("a is $a")
		in 1..20 -> print("a is between 10 to 20 include 20 : a = $a")
		2,3,4 -> print("haha a is $a")
		0 -> print("a is zero : $a")
		else -> (
				print("a*a = ${a*a}")
				)
	}
}