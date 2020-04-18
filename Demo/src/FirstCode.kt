

fun main(args : Array<String>){
    println("Hello Aliens")
    var alien = Alien()
    println("alien birth name is : " + alien.birth_name)
    alien.name = "YOYO"
    println("alien name is changed in earth to : ${alien.name}")

    //create object of java class
    var telusko = JAlien()
    telusko.birthName = "telusko"
    telusko.name = "JAADOO"

    println("alien birth name is ${telusko.birthName}")
    println("alien name is changed in earth to : ${telusko.name}")
}