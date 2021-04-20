/* 7. Create a list of 50 members using function 2n+3. Create second list excluding all elements multiple of 7. */
object exclude_7{
    def main(args:Array[String]) : Unit =  {
        val functionList = List.tabulate(50)(n=>(2*n)+3)
        println(functionList)
        var multipleOf7 = functionList.filter(x=> x%7 != 0)
        println(multipleOf7)
    }
}
