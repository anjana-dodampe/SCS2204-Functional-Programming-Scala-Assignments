object wholeSaleCost extends App{

  //Calculates total amount for specific no. of books
  def priceOfBooks(x:Int):Double = x*24.95;

  //Calculates the discount
  def discount(realPrice:Double):Double = realPrice*0.4;

  //calculate the Shipping Cost
  def shipCost(x:Int):Double=if(x>50) 3*50+(x-50)*0.75 else x*3;

  //Calculates the wholesale cost
  val wholesalecost = priceOfBooks(60) - discount(priceOfBooks(60)) + shipCost(60);
  println("Whole sale cost of Books = Rs. " + wholesalecost );


}