package pattern.creational;

import pattern.creational.model.Singleton;
import reflection.Person;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton); // pattern.creational.model.Singleton@35f983a6

        Singleton singletonAnother = Singleton.getInstance();
        System.out.println(singletonAnother); // pattern.creational.model.Singleton@35f983a6

        Person person = new Person("Name", 25);
        System.out.println(person); // reflection.Person@edf4efb

        person = new Person("Age", 150);
        System.out.println(person); // reflection.Person@2f7a2457

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            executor.submit(() -> {
                Singleton singletonInThread = Singleton.getInstance();
                System.out.println("Поток: " + Thread.currentThread().getName() +", Singleton: " + singletonInThread);
            });
        }
        // Поток: pool-1-thread-1, Singleton: pattern.creational.model.Singleton@35f983a6
        // Поток: pool-1-thread-3, Singleton: pattern.creational.model.Singleton@35f983a6
        // Поток: pool-1-thread-4, Singleton: pattern.creational.model.Singleton@35f983a6
        // Поток: pool-1-thread-2, Singleton: pattern.creational.model.Singleton@35f983a6
        // Поток: pool-1-thread-5, Singleton: pattern.creational.model.Singleton@35f983a6

        executor.shutdown();
    }
}
