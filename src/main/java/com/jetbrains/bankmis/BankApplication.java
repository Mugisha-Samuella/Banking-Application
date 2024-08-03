package com.jetbrains.bankmis;

public class BankApplication {
    public static void main(String[] args) {

    }
}

class BankAccount{
    int balance = 0;
    int previousTransaction;
    String _customerName;
    String _customerId;

    BankAccount(String customerName, String customerId){
        _customerName = customerName;
        _customerId = customerId;
    }

    void deposit(int amount){
        if(amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }
     void withdraw(int amount){
            if(amount != 0) {
                balance -= amount;
                previousTransaction = -amount;
            }
     }

     void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }else {
            System.out.println("No Transaction");
        }
     }

     void displayMenu(){
        System.out.println("Bank Account");
     }

}
