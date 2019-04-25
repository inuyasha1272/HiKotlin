fun main(args: Array<String>) {
	//常量用val定义：
	val a = 1;

	//隐式定义 智能类型推断：此处给y赋值的是一个long类型的数值，则y就被定义为long类型了。此后再给y赋其他值就会编译报错。
	var y = 99L;

	//变量用var定义；显示定义：
	var x: Float = 19.0f;
	
	var z:Int
	
	//注:变量没有初始化赋值时，只能显示定义
}