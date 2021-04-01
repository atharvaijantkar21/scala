/*This program accepts 2 numbers, does sum of them and find the average
*/

object Average {
    def main(args: Array[String]) : Unit = {
        println("Enter Lower bound: ")
        var lowerBound = scala.io.StdIn.readInt()
        println("Enter Upper bound: ")
        var UpperBound = scala.io.StdIn.readInt()

        println("Sum = "+(lowerBound+UpperBound))
        println("Average = "+(lowerBound+UpperBound)/2)

    }
}