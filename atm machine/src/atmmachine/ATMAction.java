package atmmachine;

public interface ATMAction {
    boolean isMyAction(int userInput);

    AtmActionParameter preAction();

    void action(AtmActionParameter atmActionParameter);
}
