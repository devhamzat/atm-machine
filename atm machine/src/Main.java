import atmmachine.ATMAction;
import atmmachine.AtmActionFactory;
import atmmachine.AtmActionParameter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = getChoice();
        while (choice != 4) {
            if (choice >= 1 && choice <= 4) {
                for (ATMAction atmAction : AtmActionFactory.getAtmActions()) {
                    if (atmAction.isMyAction(choice)) {
                        AtmActionParameter atmActionParameter = atmAction.preAction();
                        atmAction.action(atmActionParameter);
                    }
                }

            } else {
                System.out.println("incorrect prompt selection");
                break;
            }
                    choice = getChoice();
        }


    }


    private static int getChoice() {
        System.out.println("********************");
        System.out.println("Automated Teller Machine");
        System.out.println("Choose 1 for Deposit");
        System.out.println("Choose 2 for Withdrawal");
        System.out.println("Choose 3 for Check Balance");
        System.out.println("Choose 4 for Exit");
        System.out.print("Choose the operation you want to perform:");
        Scanner ui = new Scanner(System.in);
        int choice = ui.nextInt();
        return choice;
    }
}