package database.service;

import database.model.Author;
import database.model.Book;
import database.repository.AuthorRepository;
import database.repository.BookRepository;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Service
public class LibraryService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final EntityManager entityManager;

    public LibraryService(AuthorRepository authorRepository, BookRepository bookRepository, EntityManager entityManager) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.entityManager = entityManager;
    }

    @Transactional
    public void addAuthorWithBook() {
        Author author = new Author();
        author.setName("Лев Толстой");

        Book book1 = new Book();
        book1.setDescription("Война и мир");
        book1.setAuthor(author);

        Book book2 = new Book();
        book2.setDescription("Анна Каренина");
        book2.setAuthor(author);

        author.getBooks().add(book1);
        author.getBooks().add(book2);

        authorRepository.save(author);
    }

    @Transactional
    public void testFirstLevelCache() {
        Author author1 = entityManager.find(Author.class, 1L);
        Author author2 = entityManager.find(Author.class, 1L); // Из кэша!

        System.out.println("Автор 1: " + author1.getName());
        System.out.println("Автор 2: " + author2.getName());
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
