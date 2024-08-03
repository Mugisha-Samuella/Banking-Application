package com.jetbrains.bankmis;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
       BankAccount customer1 = new BankAccount("Samuella", "12001");
       customer1.displayMenu();
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
        char option = '\0';
        Scanner in = new Scanner(System.in);

         System.out.println("Welcome " + _customerName);
         System.out.println("Your ID is " + _customerId);
         System.out.println("\n");

         System.out.println("A. Check Balance");
         System.out.println("B. Deposit");
         System.out.println("C. Withdraw");
         System.out.println("D. Previous Transaction");
         System.out.println("E. Exit");

         do{
             System.out.println("========================================");
             System.out.println("Enter your choice: ");
             System.out.println("=========================================");
             option = in.next().charAt(0);
             switch(option){
                 case 'A':
                     System.out.println("----------------------------------");
                     System.out.println("Your balance is: " + balance);
                     System.out.println("----------------------------------");
                     System.out.println("\n");
                     break;
                 case 'B':
                     System.out.println("----------------------------------");
                     System.out.println("Enter amount: ");
                     int amount = in.nextInt();
                     deposit(amount);
                     System.out.println("You Deposited: " + amount);
                     System.out.println("----------------------------------");
                     System.out.println("\n");
                     break;

                 case 'C':
                     System.out.println("----------------------------------");
                     System.out.println("Enter amount: ");
                     int amount2 = in.nextInt();
                     withdraw(amount2);
                     System.out.println("You Withdrawn: " + amount2);
                     System.out.println("----------------------------------");
                     System.out.println("\n");
                     break;

                 case 'D':
                     System.out.println("----------------------------------");
                     getPreviousTransaction();
                     System.out.println("-----------------------------------");
                     System.out.println("\n");
                     break;
                 case 'E':
                     System.out.println("***************************************");
                     break;
                 default:
                     System.out.println("Invalid Option");
                     break;

             }
         }while(option != 'E');

         System.out.println("Thank you for using my Bank Application");

     }

}
