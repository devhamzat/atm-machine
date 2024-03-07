package atmmachine;

public class TransferAction implements ATMAction {
    @Override
    public boolean isMyAction(ActionType actionType) {
        return ActionType.TRANSFER == actionType;
    }

    @Override
    public AtmActionParameter preAction() {
        String sendersAcctNumber = InputUtil.getUserStringResponse("Input account nuumber to be debited");
        int transferAmount = InputUtil.getUserIntResponse("Input transfer amount");
        String creditedAccountNumber = InputUtil.getUserStringResponse("Enter accountnumber to be Credited");
        AtmActionParameter atmActionparameter = new AtmActionParameter();
        atmActionparameter.setDepositAmount(transferAmount);
        atmActionparameter.setAccountNumber(sendersAcctNumber);
        atmActionparameter.setCreditedAccountNumber(creditedAccountNumber);
        return atmActionparameter;
    }

    @Override
    public void action(AtmActionParameter atmActionParameter) {
        int transferAmount = atmActionParameter.getDepositAmount();
        if (transferAmount <= BankAccount.getAccountBalance(atmActionParameter.getAccountNumber())) {
            BankAccount.deductFromAccount(atmActionParameter.getAccountNumber(), transferAmount);
            BankAccount.incrementAccountBalance(atmActionParameter.getCreditedAccountNumber(), transferAmount);
            System.out.println("TRANSFER SUCCESFULL");

        } else {
            System.err.println("insuficient balance");
        }


    }
}
