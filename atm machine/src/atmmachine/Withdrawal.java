package atmmachine;

public interface Withdrawal {
    int withdrawal();
    public static int withdrawal(int balance,
                                        int withdrawAmount)
    {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : "
                + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println(
                    "Please collect your money and collect the card");
            getbalance()= depositbalance();
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }

    static int getbalance() {
        return getbalance();
    }

}

