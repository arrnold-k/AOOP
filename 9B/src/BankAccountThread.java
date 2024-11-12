public class BankAccountThread extends Thread {
    private BankAccount account;
    private double amount;
    private boolean isDeposit;

    public BankAccountThread(BankAccount account, double amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    public void run() {
        if (isDeposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}
