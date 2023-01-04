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
        Scanner ui = new Scanner(System.in);
        ui = depositAmount;
        System.out.println("Enter deposit amount");
        int choice = ui.nextInt();
        InputStream inputByUse;
        int input = choice;
        System.out.println("Your balance is " + input);

//            while (true){
//                System.out.println("Automated Teller Machine");
//                System.out.println("Choose 1 for Withdraw");
//                System.out.println("Choose 2 for Deposit");
//                System.out.println("Choose 3 for Check Balance");
//                System.out.println("Choose 4 for Exit");
//                System.out.print("Choose the operation you want to perform:");
//                //get choice from ui
//                int choice = ui.nextInt();
//                switch (choice) {
//                    case 1 -> {
//                        System.out.print("Enter Amount to be withdrawn:");
//                        //get the withdrawal money from ui
//                        Withdrawal = ui.nextInt();
//                        if (balance > withdraw) {
//                            balance = balance - withdraw;
//                            System.out.println("please collect your cash");
//                        } else {
////                        throw new InsufficientBalanceException();
//                            System.err.println("Insufficient Balance");
//                        }
//                        System.out.println(".....");
//                    }
//                    case 2 -> {
//                        System.out.print("Enter Amount to be Deposited");
//                        //get the deposit amount from ui
//                        deposit = ui.nextInt();
//                        balance = balance + deposit;
//                        System.out.println(".....");
//                    }
//                    case 3 -> System.out.println("Your blance is " + balance);
//        }
    }
}
