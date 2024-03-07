package atmmachine;

import java.util.Scanner;

public class DepositAction implements ATMAction {


    @Override
    public boolean isMyAction(ActionType actionType) {
        return ActionType.DEPOSIT == actionType;
    }


    @Override
    public AtmActionParameter preAction() {
        String accountNumber = InputUtil.getUserStringResponse("Enter account number to be deposited into");
        int depositAmount = InputUtil.getUserIntResponse("Enter amount to be deposited");
        AtmActionParameter atmActionParameter = new AtmActionParameter();
        atmActionParameter.setDepositAmount(depositAmount);
        atmActionParameter.setAccountNumber(accountNumber);
        return atmActionParameter;
    }


    @Override
    public void action(AtmActionParameter atmActionParameter) {
        int depositAmount = atmActionParameter.getDepositAmount();
        BankAccount.incrementAccountBalance(atmActionParameter.getAccountNumber(), depositAmount);
        //  BankAccount.BANK_ACCOUNT_BALANCE = BankAccount.BANK_ACCOUNT_BALANCE + depositAmount;
        System.out.println("Deposit successful ,your balance is " + BankAccount.getAccountBalance(atmActionParameter.getAccountNumber()));
    }
}
