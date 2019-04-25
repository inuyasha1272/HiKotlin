/**
 * 高阶函数：参数或者返回值是函数的函数
 * */

fun main(args: Array<String>) {
    twoParamsOneReturn { x, y -> x * y}
    twoParamsOneReturn { a, b -> a + b}
}
//参数是一个'参数为2个int返回值为int的高阶函数'
fun twoParamsOneReturn(op:(x:Int, y:Int) -> Int){
    val opResult = op(5, 2)
    println(opResult)
}