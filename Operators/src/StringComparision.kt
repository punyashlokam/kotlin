
fun main (args : Array<String>){
var str1 : String = "XOXO"
var str2 : String = "xoxo"
    if(str1.equals(str2))
        println("same")
    else
        println("not same")

    if(str1.equals(str2, true))
        println("same")
    else
        println("not same")

    if(str1 == str2)
        println("same")
    else
        println("not same")

}