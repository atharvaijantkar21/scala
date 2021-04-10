/*Write a program to sort the matrix using insertion sort.*/
import Array._

object insertionsort {
	def main(args:Array[String]) : Unit = {

		var row1, col1 = 0
		println("How many rows in a matrix do you want? ")
		row1 = scala.io.StdIn.readInt()

		println("How many columns in a matrix do you want? ")
		col1 = scala.io.StdIn.readInt()

		var myMatrix1 = ofDim[Int](row1,col1)

		for (i <- 0 to row1-1) {
			for (j <- 0 to col1-1) {
				myMatrix1(i)(j) = scala.io.StdIn.readInt()
			}
		} 
	
		for (i <- 0 to row1-1) {
			for (j <- 0 to col1-1) {
				print("\t" + myMatrix1(i)(j))
			}
			println()
		}

		var k = 0
		var arr = new Array [Int] (row1 * col1)
		for (i <- 0  to row1-1) {
			for(j <- 0 to col1-1) {
				arr(k) = myMatrix1(i)(j)
				k = k+1
			}
		}

		var key = 0
		var j = 0
		for(step <- 1 to arr.length-1) {
			key = arr(step)
			j = step-1
			while(j>=0 && key < arr(j)) {
				arr(j+1) = arr(j)
				j = j-1
			}
			arr(j+1) = key
		}
		k = 0
		for (i <- 0 to row1-1) {
			for(j <- 0 to col1-1) {
				myMatrix1(i)(j) = arr(k)
				k = k+1
			}
		}
		for (i <-0 to row1-1) {
			for(j <- 0 to col1-1) {
				print("\t" +myMatrix1(i)(j))
			}
			println()	
		}
	}
}

