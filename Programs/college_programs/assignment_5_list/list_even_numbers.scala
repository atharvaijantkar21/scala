/* 4. Create a list of even numbers up to 10 and calculate its input. */
object evenList_4{
    def main(args:Array[String]) : Unit = {       
        val evenList : List[Int] = List.range(2,11,2)
        println(evenList)

        var prod = evenList.reduce((a,b) => a*b)
/*
        var prod = 1
        for(i <- 0 to evenList.length-1)
            prod = prod * evenList(i)
*/
        println(prod)
    }
}
