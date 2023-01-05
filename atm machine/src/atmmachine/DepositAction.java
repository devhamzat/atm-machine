package atmmachine;

import java.util.Scanner;

public class DepositAction implements ATMAction {
    @Override
    public boolean isMyAction(int userInput) {
        return userInput == 1;
    }

    @Override
    public boolean isMyAction(String userInput) {
        return userInput.equalsIgnoreCase("D");
    }

    @Override
    public AtmActionParameter preAction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to be deposited");
        int depositAmount = input. nextInt();
        AtmActionParameter atmActionParameter = new AtmActionParameter();
        atmActionParameter.setDepositAmount(depositAmount);
        return atmActionParameter;
    }

    @Override
    public void action(AtmActionParameter atmActionParameter) {
        int depositAmount = atmActionParameter.getDepositAmount();
        BankAccount.BANK_ACCOUNT_BALANCE = BankAccount.BANK_ACCOUNT_BALANCE + depositAmount;
        System.out.println("Deposit successful ,your balance is " + BankAccount.BANK_ACCOUNT_BALANCE);
    }
}
