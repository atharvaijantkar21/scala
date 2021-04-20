/*Create abstract class Order (id, description). Derive two classes PurchaseOrder&amp; 
SalesOrder with members Vendor and Customer. 
Create object of each PurchaseOrder and SalesOrder. Display the details of each account.*/
abstract class order(id : Int,desc :String ){
	var orderid : Int = id
	var orderdesc : String = desc
	def viewdetails()
}//aclasss

class purchaseorder(id : Int,desc : String,name : String )extends order(id,desc){
	var vendorname : String = name
	def viewdetails() : Unit = {
		println("order id ="+orderid)
		println("order description ="+orderdesc)
		println("vendor name = "+ vendorname)
	}
	
}//class

class salesorder(id : Int,desc : String,name : String )extends order(id,desc){
	var customername : String = name
	def viewdetails() : Unit = {
		println("order id ="+orderid)
		println("order description ="+orderdesc)
		println("customer name = "+ customername)
	}
}//class

object abstractorder_3{
	def main(args:Array[String]) : Unit = {
		var ven = new purchaseorder(111,"pen","aaa")
		var cust = new purchaseorder(222,"pencil","bbb")
		ven.viewdetails()
		cust.viewdetails()
	}//main
}//abclss
