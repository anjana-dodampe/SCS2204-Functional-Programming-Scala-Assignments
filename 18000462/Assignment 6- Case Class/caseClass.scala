import math.{sqrt,pow}

object caseClass extends App{

  case class Point(a: Int, b:Int){
    def x: Int = a
    def y: Int = b

//Q1
    def +(that:Point)=Point(this.x+that.x,this.y+that.y)
    
//Q2
    def move(dx:Int, dy:Int)=Point(this.x+dx,this.y+dy)
//Q3
    def distance(i:Point):Double=sqrt(pow(x-i.x,2)+pow(y-i.y,2))
//Q4
    def invert() = Point(y,x)

  }

  val p1=Point(1,4)
  val p2=Point(8,7)

  val add =(p1+p2)
  val movePos = p1.move(5,6)
  val dist = p1.distance(p2)
  val invP1 = p1.invert()
  val invP2 = p2.invert()
  
  println("p1 : " + p1)
  println("p2 : " + p2)
  println("Point after adding p1 & p2 : "+ add)
  println("Point after moving p1 by (5,6) : "+ movePos)
  println("Distance between p1 & p2  : "+ dist)
  println("Inverted p1   : "+ invP1)
  println("Inverted p2   : "+ invP2)
  

}