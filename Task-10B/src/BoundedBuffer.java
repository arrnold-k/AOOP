import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBuffer {
    private final int[] buffer;
    private final int capacity;
    private int count;
    private int in;
    private int out;

    private final Lock lock = new ReentrantLock();
    private final Condition notEmpty = lock.newCondition();
    private final Condition notFull = lock.newCondition();

    public BoundedBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.count = 0;
        this.in = 0;
        this.out = 0;
    }

    public void put(int item) throws InterruptedException {
        lock.lock();
        try {
            while (count == capacity) {
                notFull.await();
            }
            buffer[in] = item;
            in = (in + 1) % capacity;
            count++;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public int take() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0) {
                notEmpty.await();
            }
            int item = buffer[out];
            out = (out + 1) % capacity;
            count--;
            notFull.signal();
            return item;
        } finally {
            lock.unlock();
        }
    }
}
