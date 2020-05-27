//5. Can you write a recursive function to get the addition of all even numbers less than given n.



object addEvenNum {
   def main(args: Array[String]):Unit= {
      println("Enter the Number: ");
		var num=scala.io.StdIn.readInt();
    val evenSum = addAllEven(num) - num;
    println("Sum of all even numbers less than "+num+" = "+ evenSum);
   }
   
    def isEven(n:Int):Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean = !(isEven(n))
    
  def addAllEven(n:Int):Int = n match {
        case x if(x==0) => 0
        case x if(isEven(x)) => n + addAllEven(n-1)
        case x => addAllEven(n-1)
    }
}

