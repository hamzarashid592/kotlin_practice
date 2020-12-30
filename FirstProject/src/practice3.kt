//Working with lambdas

fun main() {
    var range = (1..20).toList()

    var sum1 = { i: Int, j: Int -> i + j }
    println(sum1(5, 6))

//    Or another syntax BETTER
    var sum2: (Int, Int) -> Int = { i, j -> i + j }

    compareList(range, { i -> i % 2 != 0 })

    var additionFun=makeMath(2,'+')
    println(additionFun(6))
    var subtractionFun=makeMath(2,'-')
    println(subtractionFun(6))
    var mulFun=makeMath(2,'*')
    println(mulFun(6))
    var divFun=makeMath(2,'/')
    println(divFun(6))

}

//Making a lamba function that scans an int list and performs inner parameter function on each element of the list.
//A lambda is passed here.
fun compareList(inputList: List<Int>, elementFun: (Int) -> Boolean): Unit {

    for (i in inputList) {
        if (elementFun(i) == true)
            println("inner funcstio executed at $i")
    }

}

//Making a function that returns another function based on the operation provided.
//A lambda is returned here.
fun makeMath(num1: Int, operation : Char): (Int) -> Double = { num2 ->
    when (operation) {
        '+' -> (num1 + num2).toDouble()
        '-' -> (num1 - num2).toDouble()
        '*' -> (num1 * num2).toDouble()
        '/' -> (num1.toDouble() / num2)
        else -> {
            println("Not supported")
            0.0
        }
    }
}