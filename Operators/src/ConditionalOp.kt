
fun main (args : Array<String>){
    var num1 : Int = 4
    var num2 : Int = 4
    var result :Int = 0

    /*//normal /java code
    if(num1 > num2)
        result = num1
    else
        result = num2*/

    //if else as expression
    result = if (num1 > num2)
        num1
    else if (num1 < num2)
    num2
    else
        0
    println("the biggest number between ${num1} and ${num2} is ${result}")

}