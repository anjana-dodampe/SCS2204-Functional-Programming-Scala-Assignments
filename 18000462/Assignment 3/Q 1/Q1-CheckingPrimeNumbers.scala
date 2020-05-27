//1. Can you write a recursive function prime(n) that returns true for a prime number and false for the other? 
//For example prime(5) should return true and prime(8) should return false.

object primeNumbers {
   def main(args: Array[String]):Unit= {
      println("Enter the Number: ");
		var num=scala.io.StdIn.readInt();
    println(prime(num));
   }
   
   def gcd(a:Int, b:Int):Int = b match{
     case 0 => a
     case b if b>a => gcd(b,a)
     case _ => gcd(b, a%b)
   }

   def prime(p:Int, n:Int=2):Boolean = n match{
     case x if(x==p) => true
     case x if gcd(p,x)>1 => false
     case x =>prime(p,x+1)
   }
}




  


  

   