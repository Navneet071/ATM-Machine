package ATM_Machine;

public class ATM {
    private double balance;
    private double deposit_amount;
    private double withdraw_amount;

    // default constructor
    public ATM(){

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDeposit_amount() {
        return deposit_amount;
    }

    public void setDeposit_amount(double deposit_amount) {
        this.deposit_amount = deposit_amount;
    }

    public double getWithdraw_amount() {
        return withdraw_amount;
    }

    public void setWithdraw_amount(double withdraw_amount) {
        this.withdraw_amount = withdraw_amount;
    }
}
