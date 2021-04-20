/*Write a program to read a character from user and count 
the number of occurrences of that character.*/

object char_count{
    def main(args: Array[String]) : Unit = {
    var i, cnt = 0
    println("Enter any string: ") 
    var myString = scala.io.StdIn.readLine() 
    println("You entered: "+ myString) 
    println("Enter any character : ") 
    var charToSearch = scala.io.StdIn.readChar() 
    for(i <- 0 to myString.length()-1) 
        if(myString.charAt(i) == charToSearch) 
            cnt +=1 
    println("char "+ charToSearch +" found "+ cnt + " times")
    }
}