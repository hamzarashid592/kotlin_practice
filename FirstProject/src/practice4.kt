fun main() {

    var corolla : Car= Car(2004,"blue","Toyota")
    corolla.printMake()
    corolla.printColor() //extension function

//    Calling the static (companion) object.
    println("ID of corolla is ${Car.details.carID}")
    var civic : Car=Car(2011,"white","Honda")
    println("ID of civic is ${Car.details.carID}")


//    Calling function with default parameter.
    printSomeIntegers(12,55)
    printSomeIntegers(40) //using the default parameter

//    NULL SAFETY
//    Making a null object of Car.
    var mehran : Car?=null

//    mehran.printColor() //This will crash the code

//    Using ?. safe null operator. This will return null instead of crashing the code.
    var company1=mehran?.getBrand()
    println(company1)

    //    Using ?.let{} operator. The lambda func will be executed only if mehran is not null
    mehran?.let {
        println(mehran.getBrand())
        println("Inside the lambda")
    }

//    Using !!. non-null operator. This will return a NullPointerException instead of crashing the code.
    var company2=mehran!!.getBrand()
    println(company2)

}

//Making a dummy class
class Car(
    var make: Int,
    var color: String,
    var brand: String
) {
    init {
        carID++
    }
    fun printMake(){
        println("The make of the car is $make")
    }

//    Making a static attribute.
    companion object details{
        var carID : Int = 0
    }
}

//Making an extension functions of the class Car.
fun Car.printColor(){
    println("The color of the car is $color")
}
fun Car.getBrand() : String{
    return brand
}

//Function with default parameter.
fun printSomeIntegers(num1 : Int, num2 : Int =10){
    println("The value of num1 is $num1 while num2 $num2")
}