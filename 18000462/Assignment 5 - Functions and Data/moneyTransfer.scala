//Q3 Assignment - Functions and Data
object moneyTransfer extends App{

var acc1 = new Account("9988788V",0071234,25000)
println("Details of the Account A[Accound Holder's NIC:Account Number:Balance] :" + acc1)
var acc2 = new Account("9588789V",0071678,50000)
println("Details of the Account B[Accound Holder's NIC:Account Number:Balance] :" + acc2)
var transaction = acc1.transfer(acc2,15000)
println("Transfer Amount: "+ 15000 )
println("Transaction Successful!")

println("Account A[Accound Holder's NIC:Account Number:Balance] = " + acc1)
println("Account B[Accound Holder's NIC:Account Number:Balance] = "+acc2)

}

  class Account(id:String, n:Int, b:Double){
    
    var nic:String = id
    val acnumber: Int = n
    var balance: Double = b

    override def toString = "["+nic+":"+acnumber+":"+ balance+"]"

  def withdraw(a:Double)=this.balance=this.balance-a

  def deposit(a:Double)=this.balance=this.balance+a

  def transfer(a:Account, b:Double){this.withdraw(b); a.deposit(b)}

  }






