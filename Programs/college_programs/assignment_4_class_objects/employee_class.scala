/*2.Define a class employee (id,name,salary).define methods accept() and display.
Display details of emplyee having maximum salary */

class emp(id : Int,name : String,sal : Float) {

	var e_id : Int = id
	var e_name : String = name
	var e_sal : Float = sal
 
	var maxsal : Float = 0.0f 	

	def accept(id : Int,name :String,sal :Float) : Float ={
		
		
		if(sal >= maxsal)
		{
			maxsal=sal
		}
		return maxsal	
			
	}

	def display(){
		
		println("The maximum salary is :" + "\t" + maxsal)
		//println("details of employee having maximum salary :" + "\t" +eid+ "\t" +ename)
	}
}//class

object emp_2
{

//Main function
def main(args:Array[String])
{

	var esalary:Float =5000.0f
	var salary  = Array(10000.0,5000.0,11000.0)
	
	val e1 = new emp(1,"aaa",10000.0f)
	val e2 = new emp(2,"bbb",5000.0f)
	val e3 = new emp(3,"ccc",11000.0f)

	esalary=e1.accept(1,"aaa",10000.0f)
	esalary=e2.accept(2,"bbb",5000.0f)
	esalary=e3.accept(3,"ccc",11000.0f)
	//esalary=e3.accept(3,"ccc",11000.0f)

	

	if(salary(0) == esalary)
	{
		e1.display()
		println("id : 1 and name : aaa")
	}
	if(salary(1) == esalary)
	{
		e2.display()
		println("id : 2 and name : bbb ");
	}
	if(salary(2) == esalary)
	{
		e3.display()
		println("id : 3 and name : ccc")
	}
}
}










