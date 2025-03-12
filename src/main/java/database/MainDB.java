package database;

import database.service.LibraryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MainDB {
    public static void main(String[] args) {
        SpringApplication.run(MainDB.class, args);
        // Hibernate First Level Cache включен по умолчанию (он хранит объекты в пределах одного Session)
    }

    @Bean
    CommandLineRunner run(LibraryService service) {
        return args -> {
            service.addAuthorWithBook();
            System.out.println("Авторы в базе:");
            service.getAllAuthors().forEach(author -> System.out.println(author.getName()));
        };
    }
}
