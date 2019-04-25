interface Clickable{
    fun click()
    fun showOff() = println("click off")
}

interface Focusable{
    fun focus()
    fun showOff() = println("focus off")
}

class Button : Clickable, Focusable{

    override fun showOff() = super<Focusable>.showOff()

    override fun focus() {
        println("focus")
    }

    override fun click() {
        println("clicked")
    }

}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
}