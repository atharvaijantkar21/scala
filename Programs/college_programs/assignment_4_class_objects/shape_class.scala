/*4.create abstract class shape with abstract function volume() and display().
extend two classes cube and cylinder from it .calculate volume of each and display it */
abstract class Shape(){
		 def volume()
		 def viewDetails()
}
class Cube(var n:Int) extends Shape(){
	var VCube:Int=0
	def volume():Unit={
			VCube =( n * n * n)	
	}
	def viewDetails():Unit={

		println("Volume of cube: "+ VCube)
	}
}
class Cylinder(var r:Float,var h:Float) extends Shape(){		
	var VCylinder:Double=0
	def volume():Unit={
			VCylinder=(3.142*(r*r)*h)	
	}

	def viewDetails():Unit={		
		println("Volume of cylinder:"+ VCylinder)
	}
}

object volume{
	def main(args:Array[String]) : Unit={
	println("enter side")
	var side:Int=scala.io.StdIn.readInt()
	var p1=new Cube(side)	
	p1.volume()
	p1.viewDetails()
	println("enter radius ")
	var radius:Float=scala.io.StdIn.readFloat()
	println("enter height")
	var height:Float=scala.io.StdIn.readFloat()
	var s1=new Cylinder(radius,height)	
	s1.volume()
	s1.viewDetails()
	}
}
