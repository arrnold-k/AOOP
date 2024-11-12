public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        BankAccountThread thread1 = new BankAccountThread(account, 500.0, true);
        BankAccountThread thread2 = new BankAccountThread(account, 200.0, false);
        BankAccountThread thread3 = new BankAccountThread(account, 300.0, true);
        BankAccountThread thread4 = new BankAccountThread(account, 800.0, false);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
