 //4. Can you write a recursive function to determine even and odd numbers? 


object oddEvenNum {
   def main(args: Array[String]):Unit= {
      println("Enter the Number: ");
		var num=scala.io.StdIn.readInt();
    println("Number is an Even Number : "+isEven(num));
   }
   
   def isEven(n:Int):Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean = !(isEven(n))
}

