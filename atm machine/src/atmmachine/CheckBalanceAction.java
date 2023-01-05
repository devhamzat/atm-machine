package atmmachine;

public class CheckBalanceAction implements ATMAction{
    @Override
    public boolean isMyAction(int userInput) {
        return userInput== 3;
    }

    @Override
    public AtmActionParameter preAction() {
        return null;
    }

    @Override
    public void action(AtmActionParameter atmActionParameter) {
            System.out.println( "Your current balance is " + BankAccount.BANK_ACCOUNT_BALANCE);
    }
}
