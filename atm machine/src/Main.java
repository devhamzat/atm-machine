import atmmachine.ATMAction;
import atmmachine.AtmActionFactory;
import atmmachine.AtmActionParameter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choice = getChoice();
        List<String> permittedCharacters = new ArrayList<>();
        permittedCharacters.add("D");
        permittedCharacters.add("W");
        permittedCharacters.add("B");
        permittedCharacters.add("X");

        while (!choice.equalsIgnoreCase("X")) {
            if (permittedCharacters.contains(choice)) {
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


    private static String getChoice() {
        System.out.println("********************");
        System.out.println("Automated Teller Machine");
        System.out.println("Choose D for Deposit");
        System.out.println("Choose W for Withdrawal");
        System.out.println("Choose B for Check Balance");
        System.out.println("Choose X for Exit");
        System.out.print("Choose the operation you want to perform:");
        Scanner ui = new Scanner(System.in);
        String choice = ui.next();
        return choice;
    }
}