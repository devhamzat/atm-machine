package atmmachine;

public abstract class AtmActionFactory {

    public static ATMAction[] getAtmActions() {
        return new ATMAction[]{
                new DepositAction(),
                new WithdrawAction(),
                new CheckBalanceAction(),
                new BuyAirtimeAction()
        };
    }

    public static ATMAction findActionByType(ActionType actionType) {
        ATMAction action = null;
        for (ATMAction atmAction : getAtmActions()) {
            if (atmAction.isMyAction(actionType)) {
                action = atmAction;

            }
        }
        return action;
    }
}
