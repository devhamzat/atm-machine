package atmmachine;

import java.util.Scanner;

public class WithdrawAction implements ATMAction {

    @Override
    public boolean isMyAction(ActionType actionType) {
        return ActionType.WITHDRAWAL == actionType;
    }


    @Override
    public AtmActionParameter preAction() {
        String accountNumber = InputUtil.getUserStringResponse("Enter account number to be withdrawn from");
        int withdrawalAmount = InputUtil.getUserIntResponse("Enter amount to be withdrawn");
        AtmActionParameter actionParameter = new AtmActionParameter();
        actionParameter.setWitdrawalAmount(withdrawalAmount);
        actionParameter.setAccountNumber(accountNumber);

        return actionParameter;
    }


    @Override
    public void action(AtmActionParameter atmActionParameter) {
        int withdrawalAmount = atmActionParameter.getWitdrawalAmount();
        if (withdrawalAmount <= BankAccount.getAccountBalance(atmActionParameter.getAccountNumber())) {
            BankAccount.deductFromAccount(atmActionParameter.getAccountNumber(), withdrawalAmount);
            // BankAccount.BANK_ACCOUNT_BALANCE = BankAccount.BANK_ACCOUNT_BALANCE - withdrawalAmount;
            System.out.println("Take your cash");

        } else {
            System.out.println("insufficient balance");
        }


    }
}
