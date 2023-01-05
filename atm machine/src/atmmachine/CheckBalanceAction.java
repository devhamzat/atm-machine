package atmmachine;

public class CheckBalanceAction implements ATMAction{

    @Override
    public boolean isMyAction(ActionType actionType) {
        return ActionType.CHECK_BALANCE ==actionType;
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
