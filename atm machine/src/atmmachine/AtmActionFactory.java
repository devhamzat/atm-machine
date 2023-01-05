package atmmachine;

public abstract class AtmActionFactory {

    public static ATMAction[] getAtmActions(){
        return new ATMAction[]{
             new DepositAction(),
                new WithdrawAction(),
                new CheckBalanceAction()
        };
    }
}
