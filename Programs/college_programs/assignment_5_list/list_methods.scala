/* 1. Create lists using five different methods(Lisp style, Java style, fill, range and tabulate methods) */

object createList_1{
    def main(args: Array[String]) : Unit = {

        // Lisp-style lists, using cons :: syntax.

        val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
        val fruit2 = "mangoes" :: ("banana" :: Nil)

        var fruits12 = fruit1 :::  fruit2
        println("fruit1 ::: fruit2 : " + fruits12)

        // Use two lists with set. :::() method.

        fruits12 = fruit1.:::(fruit2)
        println( "fruit1.:::(fruit2) : " + fruits12)

        // Pass two or more lists as argument.

        fruits12 = List.concat(fruit1, fruit2)
        println("List.concat(fruit1, fruit2): " + fruits12)

        //Java style list of Strings.

        val fruit: List[String] = List("apples", "oranges", "pears")

        // List of Integers.

        val nums: List[Int] = List(1, 2, 3, 4)

        //Empty list.

        val empty: List[Nothing] = List()

        val x = List[Number](1, 2.0, 33d, 0x1)
        println(x)


        //Two dimensional list.

        val dim: List[List[Int]] = 
            List(
                List(1, 0, 0),
                List(0, 1, 0),
                List(0, 0, 1),
                )           

        println("Head of fruit : " + fruit.head)
        println("Tail of fruit : " + fruit.tail)
        println("Check if fruit is empty : "+ fruit.isEmpty)
        println("Check if nums is empty : "+ nums.isEmpty)
        println("Check if empty is empty : "+ empty.isEmpty)

        // List with range method.

        val rangeList = List.range(1, 10)
        println(rangeList)

        val rangeListStep = List.range(0, 10, 2)
        println(rangeListStep)

        // List with List-class fill method.

        val listFill = List.fill(3)("Hello")
        println(listFill)

        // List with List-class tabulate method.

        val listTabulate = List.tabulate(5)(n=>n*n)
        println(listTabulate)
    
    }
}
