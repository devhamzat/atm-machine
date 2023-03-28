package atmmachine;

import java.util.Scanner;

public class BuyAirtimeAction implements ATMAction {
    @Override
    public boolean isMyAction(ActionType actionType) {
        return ActionType.BUY_AIRTIME == actionType;
    }

    @Override
    public AtmActionParameter preAction() {
        String accountNumber = InputUtil.getUserStringResponse("Enter account number to buy airtime from :");
        int buyAirtimeAmount = InputUtil.getUserIntResponse("Enter airtime amount to be bought : ");
        AtmActionParameter actionParameter = new AtmActionParameter();
        actionParameter.setAirtimeAmount(buyAirtimeAmount);
        actionParameter.setAccountNumber(accountNumber);
        return actionParameter;


    }


    @Override
    public void action(AtmActionParameter atmActionParameter) {
        int buyAirtime = atmActionParameter.getAirtimeAmount();
        String phoneNumber = InputUtil.getUserStringResponse("Enter phone number for the airtime:");
        int intPhoneNumber = Integer.parseInt(phoneNumber);
        if (phoneNumber.length() == 11) {
            if (buyAirtime <= BankAccount.getAccountBalance(atmActionParameter.getAccountNumber())) {
                BankAccount.deductFromAccount(atmActionParameter.getAccountNumber(), buyAirtime);
                // BankAccount.BANK_ACCOUNT_BALANCE = BankAccount.BANK_ACCOUNT_BALANCE - withdrawalAmount;
                System.out.println("Airtime purchase successful for this number " + phoneNumber);

            } else {
                System.out.println("insufficient balance");
            }
        } else {
            System.err.println("Incorrect phone number format");
        }

    }

}
