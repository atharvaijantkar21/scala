/*Write a program for multiplication of two matrices
(Validate number of rows and columns before multiplication and give appropriate message)*/
import Array._

object matrixmultiplication {
	def main(args:Array[String]) : Unit = {
		
		var row1 , col1 = 0
		println("How many rows of 1st matrix?")
		row1 = scala.io.StdIn.readInt()

		println("How many columns of 1st matrix?")
		col1 = scala.io.StdIn.readInt()
		
		var myMatrix1 = ofDim[Int](row1,col1)
		
		var row2 , col2 = 0
		println("How many rows of 2nd matrix?")
		row2 = scala.io.StdIn.readInt()

		println("How many columns of 2nd matrix?")
		col2 = scala.io.StdIn.readInt()

		var myMatrix2 = ofDim[Int](row2,col2)
	
		if(row2 == col1) {
			var myMatrix3 = ofDim[Int](row1,col2)
			print("Enter your First Martix: \n")
			for (i <- 0 to row1-1) {
				for (j <- 0 to col1-1) {
					myMatrix1(i)(j) = scala.io.StdIn.readInt()
				}
			}
			print("Enter your Second Martix: \n")
			for (i <- 0 to row2-1) {
				for (j <- 0 to col2-1) {
					myMatrix2(i)(j) = scala.io.StdIn.readInt()
				}
			}
			print("Your First Matrix is: \n")
			for (i <- 0 to row1-1) {
				for (j <- 0 to col1-1) {
					print("\t" + myMatrix1(i)(j))
				}
				println()
			}
			print("Your Second Matrix is: \n")
			for (i <- 0 to row2-1) {
				for (j <- 0 to col2-1) {
					
					print("\t" + myMatrix2(i)(j))
				}
				println()
			}
			
			for (i <- 0 to row1-1) {
				for (k <- 0 to col2-1) {
					for (j <- 0 to row2-1) {
						myMatrix3(i)(k) += myMatrix1(i)(j) * myMatrix2(j)(k)
					}
				}
			}
			print("Multiplication of Two matrices are: \n")
			for (i <- 0 to row1-1) {
				for (j <- 0 to col2-1) {
					
					print("\t" + myMatrix3(i)(j))
				}
				println()
			}
		}	

		else println("Matrix multiplication is not possible")
	}
}

			
