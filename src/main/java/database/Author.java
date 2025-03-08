package database;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "author")
public class Author {
    private Long id;
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public Author() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
