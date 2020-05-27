//2. Can you write a recursive function primeSeq(n) that prints all 	prime number which less than n?

//For example prime(10) should print 2,3,5, and 7 on the terminal.

object primeSeq {
   def main(args: Array[String]):Unit= {
      println("Enter the Number: ");
		var num=scala.io.StdIn.readInt();
    println(primeSeq(num));
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

   def primeSeq(n:Int):Any = {
        
        if(prime(n)) println(n)
        if(n == 2)  0
        if(n>2) primeSeq(n-1)
    }

}




  


  

   