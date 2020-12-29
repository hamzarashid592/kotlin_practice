fun main() {
//    Occurence of a char in a string
    var str: String="Hamza Rashid Samad"
    var occur : Char='a'
    var counter:Int =0

    for(i in str){
        if (i==occur)
            counter++
    }
    println("$occur occurs $counter times in the string.")

//    Removing wide spaces from a string.

    str=str.replace(" ","",true)
    //or with regex
    str=str.replace("\\s".toRegex(),"")
    println("New string is $str")
}