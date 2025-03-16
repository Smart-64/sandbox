package database.service;

import database.model.Order;
import database.model.Product;
import database.repository.OrderRepository;
import exception.InvalidOrderException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;

@Service
public class OrderService {
    @PersistenceContext
    private EntityManager entityManager;

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    @Transactional(isolation = Isolation.READ_COMMITTED) // Гарантирует, что транзакция видит только те изменения, которые были зафиксированы до ее начала.
    public void updateOrderOptimistic(Long id, String description) {
        Order order = entityManager.find(Order.class, id);
        order.setDescription(description);
        entityManager.merge(order);
    }

    @Transactional
    public void updateOrderPessimistic(Long id, String description) {
        Order order = entityManager.find(Order.class, id, LockModeType.PESSIMISTIC_WRITE);
        order.setDescription("Completed");
        entityManager.merge(order);
    }

    @Transactional
    public void save(Order o) {
        entityManager.persist(o);
    }

    @Transactional
    public void saveProduct(Product product) {
        entityManager.persist(product);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void changeAmount(BigDecimal amount) {
    }

    @Transactional
    public Order getOrderById(Long id) throws InvalidOrderException {
        return repository.getReferenceById(id);
    }
}
