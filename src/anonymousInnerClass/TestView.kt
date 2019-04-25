package anonymousInnerClass

fun main(args: Array<String>) {

    val view = View()
    view.onClickListener = object : OnClickListener{
        override fun onClick() {
            println("the view is Clicked")
        }
    }

    view.click()
}