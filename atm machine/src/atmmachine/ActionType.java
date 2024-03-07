package atmmachine;

public enum ActionType {
    WITHDRAWAL("W"),
    DEPOSIT("D"),
    CHECK_BALANCE("B"),
    BUY_AIRTIME("F"),
    EXIT("X"),
    TRANSFER("T");
    private String type;

    ActionType(String c) {
        this.type = c;
    }

    public String getType() {
        return type;
    }

    public static ActionType getActionType(String c) {
        for (ActionType actionType : ActionType.values()) {
            if (actionType.type.equalsIgnoreCase(c)) {
                return actionType;
            }
        }
        return null;
    }
}
