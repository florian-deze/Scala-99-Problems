//Solution Problem 7 : Flatten a nested list structure

object MyClass {
	
	def flatten(y: List[_]): List[Any] = y match {
  		case Nil => Nil
  		case (head: List[_]) :: tail => flatten(head) ::: flatten(tail)
  		case head :: tail => head :: flatten(tail)
	}
	
	def main(args: Array[String]) {
		val listForTest = List(List(1, 1), 2, List(3, List(5, 8)))
		println(flatten(listForTest))
	}
		
}