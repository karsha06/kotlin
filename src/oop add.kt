class nairobi{
    // data member
    var nambari:Int=9
    // member function
    fun add ():Int{
        return nambari+nambari
    }
}

fun main(args: Array<String>) {
    // instance of my object

    val myobj=nairobi()
    println(myobj.add())
}