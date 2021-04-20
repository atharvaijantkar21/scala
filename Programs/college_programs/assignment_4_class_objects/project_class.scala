/* Create class Project (id, name, location). Define parameterized constructor. 
Keep a count of each object created and display the details of each project*/

class Project_1(id:Int,name:String,location:String){

	var Id:Int=id
	var Name:String=name
	var Location:String=location
	var no:Int=0	
	def Pcount(no:Int):Unit={	
		var no1:Int=no	
		println(" objects created :"+ no1)
	}
	
	def display():Unit={
		println("id of project :"+Id)
		println(" name of project:" +Name)
		println("location of project :" +Location)
	}
}

object project{
		def main(args:Array[String]) : Unit={
		println("enter how many record")
		var n:Int=scala.io.StdIn.readInt()
		var cnt:Int=0
		var s1=new Array[Project_1](n)
		for(i<-0 to n-1)
		{
			//var cnt:Int=0
			println("enter id of project")
			var  proId:Int=scala.io.StdIn.readInt()
			println("enter name of project")
				var proname:String=scala.io.StdIn.readLine()
			println("enter location of project")
			var  proloc:String=scala.io.StdIn.readLine()
			s1(i)=new Project_1(proId,proname,proloc)		
		}		
		for(i<-0 to n-1)
		{
			cnt=cnt+1
			s1(i).Pcount(cnt)
			s1(i).display()
		}				
	}
}
