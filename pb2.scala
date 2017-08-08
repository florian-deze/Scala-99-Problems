//Solution Problem 2 : Find the last but one element of a list

object MyClass {
      def main(args: Array[String]) {
         val y = List(1,2,3,4,5,6,7,8)
         var x = y
         val count = y.length
         for (i <- 1 to count-2) {
             x = x.tail
         }
         println(x.head)
      }
}