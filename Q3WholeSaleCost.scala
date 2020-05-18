object wholeSaleCost extends App{
  val unitPrice: Double =24.95*(1 - 0.4);
  def shipCost(x:Double)=(unitPrice*x + 3*50 + 0.75*(x-50));
  println("Whole Sale Cost for 60 copies = Rs. " + shipCost(60));

}