object TempConver extends App{

  //Convert Centigradz to Farenheit
  def convert(x:Double)=x*1.8+32;

  println("Temperature in Farenheite = " + convert(35));
}
