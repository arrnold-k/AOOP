import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SharedBuffer {
    private BlockingQueue<String> buffer = new LinkedBlockingQueue<>(10);

    public void put(String message) throws InterruptedException {
        buffer.put(message);
    }

    public String take() throws InterruptedException {
        return buffer.take();
    }
}
