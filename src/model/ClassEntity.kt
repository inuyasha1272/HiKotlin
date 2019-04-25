package model

class ClassEntity() {

    var message:String? = null
    var status:Int = -1
    var data:Animal? = null

    override fun toString(): String {
        return "ClassEntity(message=$message, status=$status, data=$data)"
    }


}