/*Design abstract class Employee with computeSal() as abstract function. 
Create two subclasses Worker and Manager. 
Salary of worker should be calculated on hourly basis of work and Salary of Manager should be calculated on 
monthly basis with additional incentives.*/

abstract class Employee{
	def computeSal() //abstract function
}//ab

class Worker(whr : Int)extends Employee{
	var WHR : Int = whr 
	def computeSal() : Unit ={
		var tsal : Int = 0
		println("salary for workers is 55 rs per hour")
		tsal=55*WHR
		println("Hourly salary is :"+"\t"+tsal)	
	}//def
}// class worker

class Manager(mth : Int) extends Employee{
	var MTH : Int = mth	
	var tmsal : Int = 0
	def computeSal() : Unit ={
		println("salary for per month is 20,000 and if month is more than 1 year then manager will recieve incentive for additional	months which is 1000")
		tmsal=20000*MTH
		println("the salary of manager is : "+"\t"+tmsal);

		if(MTH>12)//if salary > 12 months that is eg 13 months
		{
			var t : Int = 0
			t = MTH-12
			t=t*1000;
			println("additional incentive amount will be  :"+"\t"+t)	
		}	
	}
}// class manager

object Employee_7{

	def main (args : Array[String]) : Unit ={
		println("Enter work hour of worker :")
		var workhr : Int=scala.io.StdIn.readInt()
		println("Enter number of months completed by manager :")
		var monthly : Int=scala.io.StdIn.readInt()
		var wrk=new Worker(workhr)
		var mng=new Manager(monthly)
		wrk.computeSal()
		mng.computeSal()
	}//main
}//ob


