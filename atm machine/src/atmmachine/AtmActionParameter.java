package atmmachine;

public class AtmActionParameter {
   private int depositAmount;

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }
    private int witdrawal;

    public int getWitdrawal() {
        return witdrawal;
    }

    public void setWitdrawal(int witdrawal) {
        this.witdrawal = witdrawal;
    }

    private int buyairtime;

    public int getBuyairtime() {
        return buyairtime;
    }

    public void setBuyairtime(int buyairtime) {
        this.buyairtime = buyairtime;
    }
}
