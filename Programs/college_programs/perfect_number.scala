/*A number is a perfect number if is equal to sum of its proper divisors, 
that is, sum of its positive divisors excluding the number itself. 
Write a function to check if a given number is perfect or not.
*/
object PerfectNumbers {
    def main(args: Array[String]) : Unit = {
        var i=1
        for(i <- 1 to 5)
        {
            println("Enter a number :")
            var num = scala.io.StdIn.readInt()
            var j,sum=0
            for(j <- 1 to num-1)
                if(num % j == 0)
                    sum = sum+ j
            if(sum == num)
                println(num + " is Perfect")
            else
                println(num + " is not Perfect")
        }
    }
}