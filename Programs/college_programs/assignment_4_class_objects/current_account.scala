/*Define a class CurrentAccount (accNo, name, balance, minBalance). 
Define appropriate constructors and operations withdraw(), deposit(), viewBalance(). 
Create an object and perform operations. */
class currentacc(accno : Int, name : String, balance : Float, minbalance : Float){
	var acno : Int = accno
	var acname : String = name
	var acbalance : Float = balance
	var acminbalance : Float = minbalance
	def deposit(amount : Float) : Unit = {
		acbalance += amount
	}

	def viewbalance() : Unit = {
		println("Balance="+"\t"+acbalance)
	}

	def withdraw(amount : Float) : Boolean ={
		if(acbalance - amount < acminbalance) return false
		acbalance -= amount
		return true
	}

}//class

object currentaccount_1{
	def main (args:Array[String]) : Unit ={
		val ac1 = new currentacc(111,"aaa",1000,500)
		ac1.deposit(200)
		ac1.withdraw(1000)
		ac1.viewbalance()
	}
}//class
