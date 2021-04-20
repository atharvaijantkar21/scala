/*Write a program to read two strings. Remove the occurrence of second string in first string.*/
object removeOcc_3{
    def main(args: Array[String]) : Unit = {
        var i, cnt=0 
        println("Enter your first string : ") 
        var myString1 = scala.io.StdIn.readLine() 
        println("You entered :" + myString1) 
        println("Enter your second string to remove occurance in first string: ") 
        var myString2 = scala.io.StdIn.readLine() 
        println("You entered string is : " + myString2) 
        var dest = new Array[Char](myString1.length) 
        var found=0 
        i=0 
        var j=0 
        do{
            found = myString1.indexOf(myString2,i) 
            if(i <= found-1) 
            myString1.getChars(i,found,dest,j) 
            if(i<=found-1) j = j + found-i 
            i = found + myString2.length() 
        }while(i<myString1.length()-1) 
        for (i<- 0 to j) 
        print(dest(i))
    }    
} 
