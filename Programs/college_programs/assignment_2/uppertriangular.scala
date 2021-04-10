/*Write a program to sort the matrix using insertion sort.*/
import Array._

object uppertriangular {
	def main(args:Array[String]) : Unit = {

		var row , col = 0
		println("How many rows? ")
		row = scala.io.StdIn.readInt()
		
		println("How many colums? ")
		col = scala.io.StdIn.readInt()

		var myMatrix = ofDim[Int](row,col)

		if(row==col) {
			for (i <- 0 to row-1) {
				for (j <- 0 to col-1) {
					myMatrix(i)(j) = scala.io.StdIn.readInt()
				}
			}

			for (i <- 0 to row-1) {
				for (j <- 0 to col-1) {
					print("\t" + myMatrix(i)(j))
				}
				println()
			}
			
			var flag = 1
			for (i <- 1 to row-1) {
				for (j <- 0 to i-1) {
					if(myMatrix(i)(j) !=0) flag = 0
				}
			}
		}
	}
}	


		