/* 5. Write a program to create a list with 10 members using function 3n^2+4n+6. */

object functionList_5{
    def main(args: Array[String]) : Unit = { 
        val functionList = List.tabulate(10)(n=>(3*n*n)+(4*n)+6)
        println(functionList)
    }
}
