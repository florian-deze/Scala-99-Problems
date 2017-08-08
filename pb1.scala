//Solution Problem 1 : Find the last element of a list

object MyClass {
      def main(args: Array[String]) {
         val y = List(1,2,3,4,5,6,7,8)
         var x = y
         val count = y.length
         for (i <- 1 to count-1) {
             x = x.tail
         }
         println(x.head)
      }
}