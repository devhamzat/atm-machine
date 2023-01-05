package atmmachine;

public interface ATMAction {
   boolean isMyAction(ActionType actionType);

    AtmActionParameter preAction();

    void action(AtmActionParameter atmActionParameter);
}
