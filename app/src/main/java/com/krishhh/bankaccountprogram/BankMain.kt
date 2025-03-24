package com.krishhh.bankaccountprogram

fun main(){
    val krishBankAccount = BankAccount("Krish Patel", 1000.0)

    println("${krishBankAccount.accountHolder}'s bank balance is Rs ${krishBankAccount.balance}")

    krishBankAccount.deposit(200.0)
    krishBankAccount.withdraw(500.0)
    krishBankAccount.deposit(30000.0)
    krishBankAccount.deposit(5000.0)
    krishBankAccount.withdraw(1500.0)
    krishBankAccount.displayTransactionHistory()
    krishBankAccount.accBalance()
}