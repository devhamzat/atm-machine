package atmmachine;

public class AtmActionParameter {
    private int depositAmount;
    private int witdrawalAmount;

    private int airtimeAmount;
    private String accountNumber;


    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getWitdrawalAmount() {
        return witdrawalAmount;
    }

    public void setWitdrawalAmount(int witdrawalAmount) {
        this.witdrawalAmount = witdrawalAmount;
    }

    public int getAirtimeAmount() {
        return airtimeAmount;
    }

    public void setAirtimeAmount(int airtimeAmount) {
        this.airtimeAmount = airtimeAmount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    String creditedAccountNumber;
    public void setCreditedAccountNumber(String creditedAccountNumber) {
        this.accountNumber= creditedAccountNumber;
    }
    public String getCreditedAccountNumber(){

        return creditedAccountNumber;
    }
}
