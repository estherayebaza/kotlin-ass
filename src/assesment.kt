fun main() {
    var myBook= mutableListOf<Book>(
        Book("Home Going","Bridget",200),
        Book("African Child","John",300),
        Book("Kanungu girls","Winnie",420)
    )
    println(myBook)
squares()
    var account=CurrentAccount("AD234565667778F","Esther and Sons acccount",40000.00)
    account.deposit(4000.00)
    account.withDraw(2030.00)
    account.details()
    var myAccount=SavingAccount("FM1233324443322D","Phiphi and Sons",300.00,3000)
    myAccount.deposit(200.00)
    myAccount.withDraw(100.00)
    myAccount.details()

}
data class Book(var title:String,var author:String,var pages:Int)
fun books(book:List<Book>):List<Book>{
  var myBook= mutableListOf<Book>()
    var sortedBooks=myBook.sortedByDescending { book->book.title }
    return sortedBooks
}
fun squares(){
    var square=-1
    do{
        println(square*square)
        square++
    }while (square*square<=3000)
}
open class CurrentAccount(var accountNumber:String,var accountName:String,var balance:Double){
    fun deposit(amount:Double){
        balance += amount
        println(balance)
    }
    open fun withDraw(amount: Double){
        balance-=amount
        println(balance)
    }
    fun details(){
        println( "AccountNumber $accountNumber with balance$balance is operated by ${accountName}")
    }

}

class SavingAccount(accountNumber: String,accountName: String,balance: Double,withDraws:Int):CurrentAccount(accountNumber, accountName, balance) {

    override fun withDraw(amount: Double) {
        super.withDraw(amount)
        var withDrawTimes=0
        while (withDrawTimes<4){
            withDrawTimes++
        }
        println("You can withdraw")
    }

}

