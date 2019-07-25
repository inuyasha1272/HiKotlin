package model

data class ClassEntity(var message: String?, var status: Int, var data: Animal?) {

    constructor() : this(null, 0, null)

    override fun toString(): String {
        return "ClassEntity(message=$message, status=$status, data=$data)"
    }

}