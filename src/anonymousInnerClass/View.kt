package anonymousInnerClass

class View {

    var onClickListener: OnClickListener? = null

    fun click(){
        println("click")
        onClickListener?.onClick()
    }
}
