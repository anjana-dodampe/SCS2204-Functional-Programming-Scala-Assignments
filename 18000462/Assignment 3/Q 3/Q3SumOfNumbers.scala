//3. Can you write a recursive function returns the addition of numbers from1 to n?

//For example sum(5) should print 15

object sumOfARange {
   def main(args: Array[String]):Unit= {
      println("Enter the Number: ");
		var num=scala.io.StdIn.readInt();
    println("Sum is "+sum(num));
   }
   
  def sum(n:Int):Int = n match {
        case 1 => 1
        case _ => n + sum(n-1)
    }
}




  


  

   