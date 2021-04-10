import Array._

object transpose{
    def main(args:Array[String]) : Unit = {   
        var myMatrix= ofDim[Int](3,3)
        for(i <- 0 to 2)
        {
            for(j <- 0 to 2)
            {
                println("Enter matrix (3X3) and press enter:")
                myMatrix(i)(j)=scala.io.StdIn.readInt()
            }
        }
        for (i <- 0 to 2)
        {
            for (j <- 0 to 2)
            {
                print("\t" + myMatrix(i)(j))
            }
            println()
        }
        println("Transpose :")
        for(i <- 0 to 2)
        {
            for(j <- 0 to 2)
            {
                print("\t"+myMatrix(j)(i))
            }
            println()
        }
    }
}
