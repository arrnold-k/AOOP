
public class Main {
    public static void main(String[] args) {
        Thread two = new Thread(new Printer(1, 15, 2, "Two"));
        Thread three = new Thread(new Printer(1, 15, 3, "Three"));
        Thread four = new Thread(new Printer(1, 15, 4, "Four"));
        Thread five = new Thread(new Printer(1, 15, 5, "Five"));
        Thread number = new Thread(new NumberPrinter(1, 15));

        two.start();
        three.start();
        four.start();
        five.start();
        number.start();

        try {
            two.join();
            three.join();
            four.join();
            five.join();
            number.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}