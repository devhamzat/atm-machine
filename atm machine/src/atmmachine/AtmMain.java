package atmmachine;

import java.io.InputStream;
import java.util.Scanner;

public class AtmMain implements CheckBalance,Deposit,Withdrawal {

    @Override
    public int getbalance() {
        return getbalance() + deposit();
    }

    @Override
    public int deposit() {
        return 0;
    }

    @Override
    public int withdrawal() {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Automated Teller Machine");
               System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for Exit");
                System.out.print("Choose the operation you want to perform:");
        Scanner ui = new Scanner(System.in);
        ui = depositAmount;
        System.out.println("Enter deposit amount");
        int choice = ui.nextInt();
        InputStream inputByUse;
        int input = choice;
        
        System.out.println("Your balance is " + input);
    }
}
