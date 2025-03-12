package database.service;

import database.model.Author;
import database.model.Book;
import database.repository.AuthorRepository;
import database.repository.BookRepository;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class LibraryService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public LibraryService(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
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

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
