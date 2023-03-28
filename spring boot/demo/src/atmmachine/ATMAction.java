package atmmachine;

import java.util.HashMap;
import java.util.Map;

public interface ATMAction {
   boolean isMyAction(ActionType actionType);

    AtmActionParameter preAction();


    void action(AtmActionParameter atmActionParameter);

}
