import kotlin.reflect.typeOf

fun main() {

    var a=10;
    var name="Hamza"

    println("The value of "+name+" is "+a)

    var num : Int= Int.MAX_VALUE;

    println("Num is $num");

    if (num is Int){
        println("Num is an integer");
    }

    var b=26

    println("The sum of a and b ${a+b}")


}