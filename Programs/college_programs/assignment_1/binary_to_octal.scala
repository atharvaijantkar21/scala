object binarytooctal {
    def main(args: Array[String]) : Unit = {
        var number ,choice:Int=0
        println("Enter an Integer: ")
        number = scala.io.StdIn.readInt()
        println("Enter your choice [1/2] 1.Binary 2. Octal :")
        choice = scala.io.StdIn.readInt()      
        if(choice == 1)
        {
            toBinary(number)
        }
        else if (choice == 2)
        {
            toOctal(number)    
        }
    }
    def toBinary(num:Int)={
        println("Your have choosed Binary!")
        var remainder:Int=num
        var q:Int=num
        while(q!=0)
        {
            remainder=q%2
            q = q/2
        }
        println("To Binary :"+remainder)
    }

    def toOctal(num:Int)={
        var remainder:Int=num
        var q:Int=num
        var i=0
        println("Your have choosed Octal!")
        
        while(q!=0)
        {
            // remainder=q%8
            // q = q/8
            //remainder = (q % 10) * scala.math.pow(2, i)
        }
        println("To Octal : "+remainder)
    }
}