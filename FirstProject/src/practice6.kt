fun main() {
    var accountList = arrayListOf<Account>()


    for (i in 1..10){
        var account=Account()
        account.accountName="Name$i"
        account.accountID=i
        account.accountBalance=i.toDouble()
        account.accountNumRecords=i
        accountList.add(account)
    }

    accountList.forEach{
        println(it.accountName)
    }
}

data class Account (
    var accountBalance: Double = 0.0,
    var accountName: String = "",
    var accountID: Int? = 0,
    var accountNumRecords: Int = 0
    )