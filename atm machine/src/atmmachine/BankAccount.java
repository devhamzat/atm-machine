package atmmachine;

import java.util.HashMap;
import java.util.Map;

public abstract class BankAccount {
    public static int BANK_ACCOUNT_BALANCE = 0;

    private static Map<String, Integer> ACCOUNT_NUMBER_TO_BALANCE_MAPPING = new HashMap<>();
    private static Map<String, Integer> CREDITED_ACCOUNT_NUMBER_TO_BALANCE_MAPPING = new HashMap<>();

    public static void incrementCreditAccountBalance(String creditedAccountNumber, int transferAmount) {
        int accountBalance = getAccountBalance(creditedAccountNumber) + transferAmount;
        CREDITED_ACCOUNT_NUMBER_TO_BALANCE_MAPPING.put(creditedAccountNumber, accountBalance);
    }

    public static int getAccountBalance(String accountNumber) {
        return ACCOUNT_NUMBER_TO_BALANCE_MAPPING.getOrDefault(accountNumber, 0);
    }

    public static void deductFromAccount(String accountNumber, int amount) {
        int accountBalance = getAccountBalance(accountNumber) - amount;
        ACCOUNT_NUMBER_TO_BALANCE_MAPPING.put(accountNumber, accountBalance);

    }

    public static void incrementAccountBalance(String accountNumber, int amount) {
        int accountBalance = getAccountBalance(accountNumber) + amount;
        ACCOUNT_NUMBER_TO_BALANCE_MAPPING.put(accountNumber, accountBalance);

    }


}
