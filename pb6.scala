//Solution Problem 6 : Find out whether a list is a palindrome

object MyClass {
		
	def isPalindrome[element](y: List[element]): Boolean = y == y.reverse

	def main(args: Array[String]) {
		val listForTest =  List(1,1,2,3,7,5,10,9)
		val listOfPalindrome = List(11,2,6,2,11)
		println(isPalindrome(listForTest))
		println(isPalindrome(listOfPalindrome))
	}

}