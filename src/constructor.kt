class safaristudents(val jina:String, val miaka:Int, val jinsia:String){

}

fun main(args: Array<String>) {
    val myobj=safaristudents("Sha", 12, "female")
    println("my name is ${myobj.jina}")
    println("my age is ${myobj.miaka}")
    println("my gender is ${myobj.jinsia}")

}