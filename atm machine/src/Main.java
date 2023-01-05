import atmmachine.ATMAction;
import atmmachine.ActionType;
import atmmachine.AtmActionFactory;
import atmmachine.AtmActionParameter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ActionType actionType = getChoice();
        while (actionType != ActionType.EXIT) {
            if (actionType == null) {
                System.out.println("incorrect prompt selection");
                break;
            } else {
                ATMAction atmAction=AtmActionFactory.findActionByType(actionType);
                AtmActionParameter atmActionParameter = atmAction.preAction();
                atmAction.action(atmActionParameter);

            }

            actionType = getChoice();
        }


    }


    private static ActionType getChoice() {
        System.out.println("********************");
        System.out.println("Automated Teller Machine");
        System.out.println("Choose D for Deposit");
        System.out.println("Choose W for Withdrawal");
        System.out.println("Choose B for Check Balance");
        System.out.println("Choose X for Exit");
        System.out.print("Choose the operation you want to perform:");
        Scanner ui = new Scanner(System.in);
        String choice = ui.next();
        ActionType actionType = ActionType.getActionType(choice);
        return actionType;
    }
}