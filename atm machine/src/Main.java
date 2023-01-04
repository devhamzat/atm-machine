import atmmachine.ATMAction;
import atmmachine.AtmActionFactory;
import atmmachine.AtmActionParameter;

import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Automated Teller Machine");
        System.out.println("Choose 1 for Deposit");
        System.out.println("Choose 2 for Withdrawal");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for Exit");
        System.out.print("Choose the operation you want to perform:");
        Scanner ui = new Scanner(System.in);
        int choice = ui.nextInt();
        for (ATMAction atmAction : AtmActionFactory.getAtmActions()) {
            if (atmAction.isMyAction(choice)) {
                AtmActionParameter atmActionParameter = atmAction.preAction();
                atmAction.action(atmActionParameter);
            }
        }


    }
}