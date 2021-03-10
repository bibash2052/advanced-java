package com.bibash.synchronization;

public class User extends Thread{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);

        bankAccount.addMoney(200);

        Thread thread = new Thread(() -> {
            ATM.withdraw(bankAccount, 300);
        });

        Thread thread1 = new Thread(() -> {
            ATM.withdraw(bankAccount, 250);
        });

        thread.start();
        thread1.start();
    }
}
