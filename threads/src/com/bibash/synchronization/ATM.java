package com.bibash.synchronization;

public class ATM {

    static synchronized void withdraw(BankAccount bankAccount, int amount) {
        int balance = bankAccount.getBalance();
        if((balance - amount) < - bankAccount.getOverdraft()) {
            System.out.println("Transaction Denied");
        } else {
            bankAccount.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
        System.out.println("Current balance: " + bankAccount.getBalance());
    }
}
