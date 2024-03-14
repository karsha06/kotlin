fun main(args: Array<String>) {
    var myarr= arrayOf("shirlene","karsha",true,78,67.98f,"e")

    myarr[0]="terry"
    println("my name is ${myarr[0]}")
    var myintarr= arrayOf<Int>(12,56,52,0,3,-1)
    println(myintarr.sorted())

    var countries= arrayOf("kenya","tanzania","south africa","belgium")
    println(countries.sorted())

    

}