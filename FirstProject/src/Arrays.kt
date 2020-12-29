@file:Suppress("UNUSED_VALUE")

fun main() {
//    Arrays
    var arr = arrayOf("hamza", 23, 30.56)

    println(arr.size)

    var numArray: Array<Int> = arrayOf(23, 88, 100)
    for (i in numArray) {
        print("$i \t")
    }
    println()
//
//    println("${numArray[0]}\t${numArray[1]}\t${numArray[2]}")
//
//    var coll= Array(10,{ i -> i * 2 })
//
//    println("${coll[0]}\t${coll[1]}\t${coll[2]}")

//    Ranges
    var a = 1..20
    for (i in a) {
        print("$i \t")
    }
    println()

    var b = 10.downTo(-5)
    for (i in b) {
        print("$i \t")
    }
    println()

//    Switch case
    var number = 100;

    when (number) {
        0 -> println("0 hai")
        2, 3, 4, 5 -> println("2,3,4,5 mein se hai")
        in 10..15 -> {
            println("10 aur 15 ke darmian hai")
        }
        else -> {
            println("Kuch bhi nhi hai")
        }
    }

//    Normal functions.
    prompt("calling")
    println(add(10, 30))
    var (char1, char2) = nextTwo('R')
    println("$char1 \t$char2")
    println("Variable args ${variableArguments(1, 2, 3, 4)}")


    var numList = 1..20;
    var evenList = numList.filter { i -> i % 2 == 0 }

    evenList.forEach { i -> print("$i \t") }

    println()

    var temp = { num1: Int, num2: Int -> num1 * num2 }
    println("Function literal ${temp(2, 2)}")

//    Higher order functions.

    var ret = firstOrder("Hamza")

    println()

    var times3 = evenList.map { i -> i * 3 }
    times3.forEach { i -> println("$i") }

    println()

    var myMap = mutableMapOf<Char, Any?>()  //? is to allow null value

    myMap['a'] = 12
    myMap['b'] = "Hamza"
    myMap.put('c', 14.1255)
    myMap.put('d', null)  //putting null

    for ((i, j) in myMap) {
        println("Key: $i and Value: $j")
    }

    var nullValue: String? = null  //Null value variable

    var hamza: Person = Person("hamza", 24, 7.7)
    hamza.printInfo()
    var asim: Engineer = Engineer("Asim", 25, 8.1, "CIS")
    asim.printInfo()


}

//    Normal functions.
fun prompt(name: String): Unit {
    val temp = name + " from func"
    println(temp)
}

fun add(num1: Int, num2: Int): Int = num1 + num2

fun nextTwo(alphabet: Char): Pair<Char, Char> {
    return Pair(alphabet + 1, alphabet + 2)
}

fun variableArguments(vararg nums: Int): Int {
    var temp = 0
    nums.forEach { j -> temp += j }
    return temp
}

//Higher order functions.
fun firstOrder(name1: String): (String) -> String = { name2 -> name2 }

//Classes
open class Person(
    var name: String,
    var age: Int,
    var height: Double
) {
    init {
        require(age > 0)
        require(height > 0)
        require(name.matches(Regex("\\D+"))) //name must have 1 or more non digit character.
    }

    open fun printInfo(): Unit {
        println("Name is $name, age $age  and height is $height")
    }
}

//Inheritance
open class Engineer(
    name: String,
    age: Int,
    height: Double,
    var tech: String
) : Person(name, age, height) {
    init {
        require(tech.matches(Regex("\\D+"))) //name must have 1 or more non digit character.
    }

    override fun printInfo() {
        println("Name is $name, age $age  and height is $height while technology is $tech")
    }
}