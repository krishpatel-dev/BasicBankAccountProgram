package com.krishhh.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited Rs $amount")
    }

    fun withdraw(amount: Double){
        if(amount <= balance){
            balance -= amount
            transactionHistory.add("$accountHolder withdrew Rs $amount")
        }else{
            println("You don't have the funds to withdraw Rs $amount")
        }
    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }

    fun accBalance(){
        println("$accountHolder's bank balance is Rs $balance")
    }
}