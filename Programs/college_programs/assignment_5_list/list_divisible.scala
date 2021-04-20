/* 3. Create a list of integers divisible by 3 from list containing numbers from 1 to 50.*/

object divisibleList_3{
    def main(args:Array[String]) : Unit = {

        val listTabulate = List.range(1,51)
        println(listTabulate)

        var divisibleBy3 = listTabulate.filter(x=> x%3 == 0)
        println(divisibleBy3.toList)
    }
}
