//Q4 Assignment - Functions and Data
object moneyTransfer extends App{

var a1 = new Account("9988788V",001,25000)
var a2 = new Account("9588789V",002,50000)
var a3 = new Account("9588249V",003,-23454)
var a4 = new Account("9523139V",004,84500)
var a5 = new Account("9582324V",005,-15000)
var a6 = new Account("9588999V",006,-45)
var a7 = new Account("9411234V",007,43435)

var bank:List[Account]=List(a1,a2,a3,a4,a5,a6,a7)


// val it=bank.toIterator
// while(it.hasNext){
  
//     print(it.next)
//   }

//To find Owner & Acccounts he has
val find=(n:String, b:List[Account])=>b.filter(x=>x.nic.equals(n))

//List of Accounts with negative balances
val overdraft=(b:List[Account])=>b.filter(x=>x.balance<0)
println("Accounts with negative Balances :"+ overdraft(bank))

//Total of all account balances
val totalbalance=(b:List[Account])=> b.reduce((x,y)=>new Account("",0,x.balance+y.balance))
println("Sum of all account balances :"+ totalbalance(bank))

//final balances of all accounts after apply the interest function
val interest=(b:List[Account])=>b.map((x)=>if(x.balance<0) x.balance=x.balance+(x.balance*0.1) else x.balance=x.balance+(x.balance*0.05))

//Adding interest to the account balance
interest(bank)
println("Sum of all account balances with Interest :"+ totalbalance(bank))

}

  class Account(id:String, n:Int, b:Double){
    
    var nic:String = id
    val acnumber: Int = n
    var balance: Double = b

    override def toString = "["+nic+":"+acnumber+":"+ balance+"]"

 

  }






