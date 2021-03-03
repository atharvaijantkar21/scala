/* This progrma find out the factorials of given numbers eg. 3 --> 3*2*1 = 6 
*/
object factorial {
    def main(args: Array[String]) : Unit = {
        print("Enter any number: ") 
        var num =scala.io.StdIn.readInt()
        var i,prod=1
        for(i <- 1 to num)
            prod = prod * i
        println("Factorial of " +num+ " = " + prod)
    }
}