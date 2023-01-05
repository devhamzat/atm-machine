package atmmachine;

public interface ATMAction {
   boolean isMyAction(int userInput);
   boolean isMyAction(String userInput);

    AtmActionParameter preAction();

    void action(AtmActionParameter atmActionParameter);
}
