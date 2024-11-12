
public class NumberPrinter implements Runnable {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
