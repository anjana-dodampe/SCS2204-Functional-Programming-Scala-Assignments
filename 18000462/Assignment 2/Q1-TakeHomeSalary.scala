//Assignment 2 - Q1
object Salary extends  App {

  def normalWage(hours:Int):Int=hours*150;

  def otWage(hours:Int):Int=hours*75;

  def income(h1:Int, h2:Int):Int= normalWage(h1) + otWage(h2);

  def tax(income:Int):Double= income*0.1;
  
  def takeHomeSal(h1:Int, h2:Int):Double= income(h1,h2)- tax(income(h1,h2));

  printf("%s %.2f","Take home sallary = Rs.", takeHomeSal(40,20));

}