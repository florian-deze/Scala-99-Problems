//Solution Problem 3 : Find the Kth element of a list

object MyClass {

		def nth[element](n: Int, y: List[element]): element = (n, y) match {
			//empty list
			case (_, Nil) => throw new NoSuchElementException
			//first element in list
			case (0, _ :: tail) => y.head
			//more than one element in list
			case (n, _ :: tail) => nth(n-1, tail)
		}

		def main(args: Array[String]) {
		    
			val listForTest = List(1,1,2,3,7,5,10,9)
			var res = nth(4, listForTest)
			println(res)
			val listOfElement = List("A","B","C")
			var res2 = nth(0,listOfElement)
			println(res2)
			try {
			    val listNull = List()
			    var res3 = nth(4, listNull)
			    println(res3)
		    }catch {case nilException: NoSuchElementException => println("NoSuchElementException")}
			
		}
}