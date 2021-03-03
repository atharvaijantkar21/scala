/*This code finds the sum of prime number frokm 2 to 100
*/

object SumOfPrimeNmumbers {
    def main(args: Array[String]) : Unit = {
        var i,sum=0
        for(i <- 2 to 100)
        {
            if(isPrime(i))
                sum = sum + i
        }
        println("Sum = "+sum)
    }
    def isPrime(num:Int) : Boolean = {
        var sum= 0
        for(j <- 2 to num-1)
            if(num % j == 0)
                sum = sum + 1
        if(sum == 0) return true
        return false
    }
}