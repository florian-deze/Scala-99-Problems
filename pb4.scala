//Solution Problem 4 : Find the number of elements of a list

object MyClass {

		def nbElement[element](y: List[element]): Int = y match {
			//empty list
			case Nil => 0
			//many element
			case _::tail  => 1 + nbElement(tail)
		}
		
		def main(args: Array[String]) {
			val listForTest = List(1,1,2,3,7,5,10,9)
			val listForTest2 = List()
			val listForTest3 = List(1)
			
			var res = nbElement(listForTest)
			println(res)
			
			res = nbElement(listForTest2)
			println(res)
			
			res = nbElement(listForTest3)
			println(res)
			
		}

}