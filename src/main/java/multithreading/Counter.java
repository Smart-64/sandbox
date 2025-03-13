package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 0;
    private final Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            this.count++;
        } finally {
            lock.unlock();
        }
    }

    public synchronized double getCount() {
        return this.count;
    }
}
