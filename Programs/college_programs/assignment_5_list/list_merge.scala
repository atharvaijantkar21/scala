/* 2. Create two Lists and Merge it and store the sorted in ascending order. */

object mergeList_2{
    def main(args: Array[String]) : Unit = {
        val myList1 = List.range(1, 11, 2)
        val myList2 = List.range(1, 10, 2)

        println(myList1)
        println(myList2)

        var mergedList = myList1.concat(myList2)
        println(mergedList.sorted)
    }
} 
