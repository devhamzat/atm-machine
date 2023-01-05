package atmmachine;

public abstract class AtmActionFactory {

    public static ATMAction[] getAtmActions() {
        return new ATMAction[]{
                new DepositAction(),
                new WithdrawAction(),
                new CheckBalanceAction()
        };
    }

    public static ATMAction findActionByType(ActionType actionType) {
        ATMAction action;
        for (ATMAction atmAction : getAtmActions()) {
            if (atmAction.isMyAction(actionType)) {
                action = atmAction;

            }
        }
        return action;
    }
}
