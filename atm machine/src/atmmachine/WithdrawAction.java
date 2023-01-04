package atmmachine;

import java.util.Scanner;

public class WithdrawAction implements ATMAction{
    @Override
    public boolean isMyAction(int userInput  ) {
        return userInput == 2;
    }

    @Override
    public AtmActionParameter preAction() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn");
        int withdrawalAmount = input.nextInt();
        if (withdrawalAmount < BankAccount.BANK_ACCOUNT_BALANCE  ){
            withdrawalAmount = BankAccount.BANK_ACCOUNT_BALANCE - withdrawalAmount;
            System.out.println("Take your cash");
        }else{
            System.out.println("insufficient balance");
        }

        return null;
    }

    @Override
    public void action(AtmActionParameter atmActionParameter) {
        int withdrawal  = atmActionParameter.getDepositAmount();
        BankAccount.BANK_ACCOUNT_BALANCE = BankAccount.BANK_ACCOUNT_BALANCE - withdrawal;
        System.out.println("Balance is " + BankAccount.BANK_ACCOUNT_BALANCE);


    }
}
