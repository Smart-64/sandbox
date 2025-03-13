package database;

import database.model.Order;
import database.model.Product;
import database.service.LibraryService;
import database.service.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class MainDB {
    public static void main(String[] args) {
        SpringApplication.run(MainDB.class, args);
        // Hibernate First Level Cache включен по умолчанию (он хранит объекты в пределах одного Session)
        // Hibernate Second Level Cache включается через ямл, хранит объекты во всех сессиях.
    }

//    @Bean
//    CommandLineRunner run(LibraryService service) {
//        return args -> {
//            service.testFirstLevelCache();
//        };
//    }
//
//    @Bean
//    CommandLineRunner saveOrder(OrderService service) {
//        return args -> {
//            Order order = new Order();
//            order.setDescription("save");
//            order.setVersion(111);
//            service.save(order);
//        };
//    }

//    @Bean
//    CommandLineRunner startThreads(OrderService service) {
//        return args -> {
//            Thread thread1 = new Thread(() -> {
//                service.updateOrderOptimistic(2L, "thread1");
//            });
//
//            Thread thread2 = new Thread(() -> {
//                service.updateOrderOptimistic(2L, "thread2"); // ObjectOptimisticLockingFailureException
//            });
//
//            thread1.start();
//            thread2.start();
//        };
//    }

    @Bean
    CommandLineRunner changeAmount(OrderService orderService) {
        return args -> {

            Product product = new Product();
            product.setPrice(1000.0);
            product.setName("Коробка");
            orderService.saveProduct(product);

            Order order = new Order();
            order.setDescription("order1");
            order.setVersion(100);
            order.setProduct(product);
            product.getOrders().add(order);

            orderService.save(order);
        };
    }
}
