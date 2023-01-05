package atmmachine;

import java.util.Scanner;

public class BuyAirtimeAction implements ATMAction {
    @Override
    public boolean isMyAction(ActionType actionType) {
        return ActionType.BuyAirtime == actionType;
    }

    @Override
    public AtmActionParameter preAction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to be bought :");
        int buyAirtime = input.nextInt();
        AtmActionParameter actionParameter = new AtmActionParameter();
        actionParameter.setBuyairtime(buyAirtime);


        return actionParameter;

    }

    @Override
    public void action(AtmActionParameter atmActionParameter) {
        int buyairtime = atmActionParameter.getBuyairtime();
        int[] phone_number = new int[11];
        Scanner phoneNumber = new Scanner(System.in);
        int phonenumber=phone_number;
        System.out.println("Enter Phone number:");
        if (phonenumber=phone_number.length){
            if (buyairtime <= BankAccount.BANK_ACCOUNT_BALANCE) {
                BankAccount.BANK_ACCOUNT_BALANCE = BankAccount.BANK_ACCOUNT_BALANCE - buyairtime;
                System.out.println("Airtime purchase successful");

            } else {
                System.out.println("insufficient balance");
            }
        }

    }
}
