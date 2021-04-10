/*Write a program to calculate determinant of a matrix,
This program accepts matrix contents from user and finds its Determinant.*/  
import Array._
object determinant {
	def main(args:Array[String]) : Unit = {
		 print("\n\n Calculate the determinant of a 3*3 matrix:\n ")
        print("-----------------------------------------------\n")
        printf("Enter element in the matrix :\n")
		var myMatrix = ofDim[Int](3,3)
			for (i <- 0 to 2) {
					for (j <- 0 to 2) {
							myMatrix(i)(j) = scala.io.StdIn.readInt()
				}
			}
			for (i <- 0 to 2) {
					for (j <- 0 to 2) {
							print("\t" + myMatrix (i)(j))
				}
				println()
			}
			println("D = " + determinantOfMatrix(myMatrix,3))
	}
	
	def determinantOfMatrix(mat: Array[Array[Int]],n:Int) : Int = {
		var D = 0
		if(n==1) return mat(0)(0)
		var temp =  ofDim[Int](3,3)
		var sign = 1
		for(f <- 0 to n-1) {
			getCofactor(mat,temp,0,f,n)
			D = D + sign * mat(0)(f) * determinantOfMatrix(temp,n-1)
			sign = -sign
			}
		return D
	}
		
	def getCofactor(mat:Array[Array[Int]], temp:Array[Array[Int]],p:Int, q:Int,n:Int) : Unit = {
		var i=0
		var j=0
		for(row <- 0 to n-1) {
				for(col <- 0 to n-1) {
						if(row!=p && col!=q) {
								temp(i)(j) = mat(row)(col)
								j= j+1
								if ( j == n-1 ) {
										 j=0
										 i=i+1
								}
						}

				}

		}
	}	
}											 

								
								
							
					
						
				

