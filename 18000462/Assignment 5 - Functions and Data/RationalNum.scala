//Q1 & Q2 - Assignment - Functions and Data

object RationalNum extends App{

val x = new Rational(3,4)
val y = new Rational(5,8)
val z = new Rational(2,7)

println("x ="+x)
println("y ="+y)
println("z ="+z)

val res1 = x-y-z


println("x - y - z ="+ res1)

}

  class Rational(n:Int, d:Int){
    require(d>0,"y must be greater than 0") //To prevent 0 becoming the denominator

    def numer = n/gcd(Math.abs(n),d)   //To correct
    def denom = d/gcd(Math.abs(n),d)
    def this(n:Int)=this(n,1)    //Auxillary constructor to print 2/1, when a single parameter is passed to Rational class
 
  //To print rational number addition results in simplest fraction form
  private def gcd(a:Int, b:Int):Int=if(b==0) a else gcd(b,a%b)

    def +(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer, denom*r.denom)

    def neg=new Rational(-this.numer,this.denom)

    def -(r:Rational) =this+r.neg
    
    override def toString = numer+"/"+denom 
  }







