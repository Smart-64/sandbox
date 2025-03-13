package multithreading;

public class Worker implements Runnable {
    private final Counter counter;

    public Worker(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Имя текущего потока: " + Thread.currentThread().getName());
        counter.increment();
        System.out.println(counter.getCount());
    }
}
