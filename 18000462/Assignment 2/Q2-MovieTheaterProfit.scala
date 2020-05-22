//Assignment 2 - Q2
object movieTheatre {
 
   def main(args: Array[String]): Unit = {
      println("Enter the ticket price: ");
		var tcktPrice=scala.io.StdIn.readInt();
    printf("%s, %.2f", "Profit =",profit(tcktPrice));

   }

   def attendance(tcktPrice:Int):Int = {120 + (15 - tcktPrice)/5*20};

   def revenue(tcktPrice:Int):Double = {attendance(tcktPrice)*tcktPrice};

   def cost(tcktPrice:Int): Double={500 + attendance(tcktPrice)};

   def profit(tcktPrice:Int):Double ={ revenue(tcktPrice) - cost(tcktPrice)};


  
}