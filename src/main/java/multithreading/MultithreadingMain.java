package multithreading;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingMain {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            int task = i;
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " выполняет инкремент для задачи " + task);
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " Результат инкремента: " + counter.getCount());
            });
        }
    }
}
