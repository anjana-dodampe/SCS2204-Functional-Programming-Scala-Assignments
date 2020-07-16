object CaesarCipher{

  def main(args: Array[String]): Unit = {
    
    val alphabet:String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    while(true){
    
   
   println("------The Caesar Ciper------")
   println("Select Your Option")
   println("(1) Encrypt a Text")
   println("(2) Decrypt a Text")
   println("(3) Exit")
   println("Enter the Number of your prefered option : ")

   val ch:Int = scala.io.StdIn.readInt()

   if(ch==1){
     val inputStr:String = scala.io.StdIn.readLine("Enter the Text : ")
   
     println("Enter the No. of Shifts : ")
     val shift:Int = scala.io.StdIn.readInt()
     val result = cipher(encry,inputStr,shift,alphabet)
     println("****Encrypted Output = "+result)
   }
   else if(ch==2){
     val inputStr:String = scala.io.StdIn.readLine("Enter the Text : ")
   
     println("Enter the No. of Shifts : ")
     val shift:Int = scala.io.StdIn.readInt()
     val result = cipher(decry,inputStr,shift,alphabet)
     println("****Decrypted Output = "+result)
   }else if(ch==3){
     System.exit(1)
   }else{
     println("Error : - Invalid Option!!!")
   }
   
  
    }
  }

  
//Encryption
  val encry = (c:Char, key:Int, a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
//Decryption
  val decry = (c:Char, key:Int, a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
//Caesar Cipher
  val cipher = (algo:(Char,Int,String)=>Char, s:String, key:Int, a:String)=>s.map(algo(_,key,a))

}