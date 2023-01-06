package atmmachine;

import java.util.Scanner;

public class BuyAirtimeAction implements ATMAction {
    @Override
    public boolean isMyAction(ActionType actionType) {
        return ActionType.BUY_AIRTIME == actionType;
    }

    @Override
    public AtmActionParameter preAction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to be bought :");
        int buyAirtime = input.nextInt();
        AtmActionParameter actionParameter = new AtmActionParameter();
        actionParameter.setBuyairtime(buyAirtime);
        Scanner inputPhoneNumber = new Scanner(System.in);
        System.out.println("Enter phone number for the airtime:");
        String phoneNumber = inputPhoneNumber.next();
        int intPhoneNumber = Integer.parseInt(phoneNumber);
        return actionParameter;


    }

    @Override
    public void action(AtmActionParameter atmActionParameter) {
        int buyAirtime = atmActionParameter.getBuyairtime();


            if (buyAirtime <= BankAccount.BANK_ACCOUNT_BALANCE) {
                BankAccount.BANK_ACCOUNT_BALANCE = BankAccount.BANK_ACCOUNT_BALANCE - buyAirtime;
                System.out.println("Airtime purchase successful");

            } else {
                System.err.println("insufficient balance");
            }
        }

    }
