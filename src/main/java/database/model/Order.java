package database.model;

import lombok.Getter;
import lombok.Setter;
import reflection.Person;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Version
    private Integer version;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
