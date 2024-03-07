package atmmachine;

public class CheckBalanceAction implements ATMAction {

    @Override
    public boolean isMyAction(ActionType actionType) {
        return ActionType.CHECK_BALANCE == actionType;
    }

    @Override
    public AtmActionParameter preAction() {

        String accountNumber = InputUtil.getUserStringResponse("Enter account number to check balance");
        AtmActionParameter actionParameter = new AtmActionParameter();
        actionParameter.setAccountNumber(accountNumber);
        return actionParameter;
    }


    @Override
    public void action(AtmActionParameter atmActionParameter) {
        System.out.println("Your current balance is " + BankAccount.getAccountBalance(atmActionParameter.getAccountNumber()));
    }
}
