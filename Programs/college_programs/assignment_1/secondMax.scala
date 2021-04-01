/*This code finds out second max out of 4 numbers
*/
object SecondMax {
    def main(args: Array[String]) : Unit = {
        var i,max,max2,num=0
        for(i <- 1 to 4)
        {
            println("Enter a number :")
            num = scala.io.StdIn.readInt()
            if(i == 1) 
                max = num
            else
            {
                if(num > max)
                {
                    max2 = max
                    max = num
                }
                else if(i == 2) 
                    max2 = max
                else if(num > max2) 
                    max2 = num
            }
        }
        println("2nd Maximum num =" + max2)
    }
}