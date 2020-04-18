
fun main (args : Array<String>){

   // var str1 : String = null//  null cannot be a value of non null type string
    var str1 : String? = null
   // println(str1.length) //only safe call are allowed here
    println(str1?.length) // append question mark

    var alien = Alien();
    //alien.name.toUpperCase() //only safe call are allowed here
    alien.name?.toUpperCase() //prints null

   // alien = null // can't be null
    var alien1 :Alien? = Alien();
    alien1 = null
    //alien1.name ////only safe call are allowed here
    alien1?.name//prints expression





/*var str1 : String = "XOXO"
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
        println("not same")*/

}