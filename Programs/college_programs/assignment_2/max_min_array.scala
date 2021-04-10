/* Write a program to find maximum and minimum of an array
*/
import Array._

object maxmin{
    def main(args:Array[String]):Unit={ 
        var n = 0
        println("How many elements in array?")
        n = scala.io.StdIn.readInt()
        var myList = new Array [Int](n)

        var i = 0
        for (i <- 0 to (myList.length - 1))
            myList(i) = scala.io.StdIn.readInt()
        for (x <- myList)
            println(x)

        var max = myList(0)
        var min = myList(0)
        for (i <- 1 to (myList.length -1))
        {
            if(myList(i) > max) max = myList(i)
            if(myList(i) < min) min = myList(i)
        }
        println("Max = "+ max)
        println("Min = "+ min)
    }
}
