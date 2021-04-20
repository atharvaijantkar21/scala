/*Define a class Sports (id, name, description, amount). Derive two classes Indoor and Outdoor. 
Define appropriate constructors and operations. Create an object and perform operations.*/

 class Sports1(id:Int,name:String,description:String,amount:Float){

		var sId:Int=id
		var sDesc:String=description
		var sName:String=name
		var sAmount:Float=amount

		
}
class Indoor(id:Int,name:String,description:String,amount:Float) extends Sports1(id,name,description,amount){
		def viewDetails():Unit={
			println("Id:"+ sId)		
			println("Name:" +sName)
			println("Descriptor: "+ sDesc)
			println("Amount"+sAmount)
		}
}
class Outdoor(id:Int,name:String,description:String,amount:Float) extends Sports1(id,name,description,amount){
		def viewDetails():Unit={
			println("Id:"+ sId)		
			println("Name:" +sName)
			println("Descriptor: "+ sDesc)
			println("Amount"+sAmount)
		}
}

object sports{
		def main(args:Array[String]) : Unit={
			println("enter details for Indoor") 
			println("enter  id")
			var id:Int=scala.io.StdIn.readInt()
			println("enter  name")
			var name:String=scala.io.StdIn.readLine()
			println("enter  description")
			var desp:String=scala.io.StdIn.readLine()
			println("enter amount")
			var amount:Float=scala.io.StdIn.readInt()

				var p1=new Indoor(id,name,desp,amount)
	
				p1.viewDetails()

			println("enter details for Outdoor") 
			println("enter  id")
			var oid:Int=scala.io.StdIn.readInt()
			println("enter  name")
			var oname:String=scala.io.StdIn.readLine()
			println("enter  description")
			var odesp:String=scala.io.StdIn.readLine()
			println("enter amount")
			var oamount:Float=scala.io.StdIn.readInt()
	
			
		var p2=new Outdoor(oid,oname,odesp,oamount)
		
		p2.viewDetails()

		
	}
}


