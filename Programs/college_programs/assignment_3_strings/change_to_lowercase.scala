/*Write a program to count uppercase letters in a string 
and convert it to lowercase and display the new string.*/

object changeCase_1{
    def main(args: Array[String]) : Unit ={
        var i, cnt=0 
    println("Enter any string : ") 
    var myString = scala.io.StdIn.readLine() 
    println("You have entered "+ myString +" as a stiring")
    for(i <- 0 to myString.length()-1) 
        if(myString(i) >= 'A' && myString(i) <= 'Z')
            cnt+= 1 
    println("Upper case characters ="+ cnt) 
    println("Entered string after converting lower to upper case ="+myString.toLowerCase()) 
    }
}