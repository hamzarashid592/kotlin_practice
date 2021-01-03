import java.util.*

fun main() {

    workingWithVarbleArgs("Hamza", 24, *arrayOf("123","456","789"))

}

fun workingWithVarbleArgs(name : String, age : Int, vararg cellNo : String ){
    println("The name is $name, Cell numbers are" +
            "${cellNo[0]}, ${cellNo[1]}, ${cellNo[2]} and is $age years old")
}