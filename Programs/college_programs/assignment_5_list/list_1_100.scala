/* 6. Write a program to create a list of 1 to 100 numbers. Create second list from first list selecting numbers multiple of 10. */ 
object multiple_6{
    def main(args: Array[String]) : Unit = {
        val listTabulate = List.range(1, 101)
        var multipleOf10 = listTabulate.filter(x=> x%10 == 0)
        println(multipleOf10)
    }
}
