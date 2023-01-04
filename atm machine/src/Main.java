import java.util.Scanner;
import java .util.*;
public class Main {
    public static void main(String[] args) {
        //declare and instalize balance,withdraw,deposit
        int balance=1000000;
                  int  withdraw,deposit;
        //create scanner class object to get choice of user
        Scanner ui = new Scanner(System.in);
         while (true){
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for Exit");
            System.out.print("Choose the operation you want to perform:");
            //get choice from ui
            int choice = ui.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Amount to be withdrawn:");
                    //get the withdrawal money from ui
                    withdraw = ui.nextInt();
                    if (balance > withdraw) {
                        balance = balance - withdraw;
                        System.out.println("please collect your cash");
                    } else {
//                        throw new InsufficientBalanceException();
                        System.err.println("Insufficient Balance");
                    }
                    System.out.println(".....");
                }
                case 2 -> {
                    System.out.print("Enter Amount to be Deposited");
                    //get the deposit amount from ui
                    deposit = ui.nextInt();
                    balance = balance + deposit;
                    System.out.println(".....");
                }
                case 3 -> System.out.println("Your blance is " + balance);
            }
        }

    }

    private static class InsufficientBalanceException extends Throwable {

    }
}