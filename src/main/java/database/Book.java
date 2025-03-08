package database;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "book")
public class Book {
    private Long id;
    private String title;
    private Long author_id;
    private Integer public_year;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
