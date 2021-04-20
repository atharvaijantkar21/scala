/*Create array of strings and read a string from user. 
Display all the elements of array containing given string.*/
object StringArray{
    def main(agrs: Array[String]): Unit ={
        var i, cnt=0

        println("Enter how many strings do you want: ")
        cnt = scala.io.StdIn.readInt()
        var dest = new Array[String](cnt)
        for(i <- 0 to cnt-1){
            println("Enter String :")
            dest(i) = scala.io.StdIn.readLine()
        }
        println("Enter a string : ")
        var myString = scala.io.StdIn.readLine()
        var found = -1
        for( i <- 0 to cnt-1)
            found = dest(i).indexOf(myString,0)
            if(found != - 1)
                println(dest(i))
    }
}
