//Solution Problem 5 : Reverse a list

object MyClass { 
	def reverseListElement[element](y: List[element]): List[element] = y.foldLeft(List[element]()) { 
		(right, left) => left :: right 
	}
	
	def main(args: Array[String]) {
		val listForTest =  List(1,1,2,3,7,5,10,9)
		println(reverseListElement(listForTest))
	}
}