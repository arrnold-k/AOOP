
public class Printer implements Runnable {
    private int start;
    private int end;
    private int divisor;
    private String message;

    public Printer(int start, int end, int divisor, String message) {
        this.start = start;
        this.end = end;
        this.divisor = divisor;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                System.out.println(i + " is divisible by " + message);
            }
        }
    }
}
