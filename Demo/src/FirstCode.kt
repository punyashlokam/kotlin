

fun main(args : Array<String>){
    println("Hello Aliens")
    var alien = Alien();
    println("alien birth name is : " + alien.birth_name)
    alien.name = "YOYO"
    println("alien name is changed in earth to : ${alien.name}")

}