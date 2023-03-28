import atmmachine.ATMAction;
import atmmachine.ActionType;
import atmmachine.AtmActionFactory;
import atmmachine.AtmActionParameter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public  void main(String[] args) {
        Map<Integer,Integer> accountNumber= new HashMap<>();
        Scanner accountNumberInput= new Scanner(System.in);
       // System.out.println("Input your account number :");
      //  String stringAccountNumber = accountNumberInput.next();
        //int intAccountNumberInput = Integer.parseInt(stringAccountNumber);
       // if (stringAccountNumber.length()==10){
            ActionType actionType = getChoice();
            try {
                while (actionType != ActionType.EXIT) {
                    if (actionType == null) {
                        System.err.println("incorrect prompt selection");
                        break;
                    } else {
                        ATMAction atmAction=AtmActionFactory.findActionByType(actionType);
                        AtmActionParameter atmActionParameter = atmAction.preAction();
                        atmAction.action(atmActionParameter);

                    }
                    Thread.sleep(1500);
                    actionType = getChoice();

                }
            }catch (Exception e){
                System.err.println("ERROR");
            }
//            while (actionType != ActionType.EXIT) {
//                if (actionType == null) {
//                    System.err.println("incorrect prompt selection");
//                    break;
//                } else {
//                    ATMAction atmAction=AtmActionFactory.findActionByType(actionType);
//                    AtmActionParameter atmActionParameter = atmAction.preAction();
//                    atmAction.action(atmActionParameter);
//
//                }
//
//                actionType = getChoice();
//                Thread.sleep(1000);
//            }
       // }
        /*else{
            System.err.println("EROR: Enter your account number........ " );
                 System.err.print("Your account number is the 10 digit number on your card");
        }*/



    }


    private static ActionType getChoice() {
        System.out.println("********************");
        System.out.println("Automated Teller Machine");
        System.out.println("Choose W for Withdrawal");
        System.out.println("Choose B to Check Balance");
        System.out.println("Choose T for Transfer");
        System.out.println("Choose D for Deposit");
        System.out.println("Choose F to Buy Airtime");
        System.out.println("Choose X for Exit");
        System.out.print("Choose the operation you want to perform:");
        Scanner ui = new Scanner(System.in);
        String choice = ui.next();
        ActionType actionType = ActionType.getActionType(choice);
        return actionType;
    }
}