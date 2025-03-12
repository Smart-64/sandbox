package database.service;

import database.model.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class OrderService {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void updateOrder(Long id, String description) {
        Order order = entityManager.find(Order.class, id);
        order.setDescription(description);
        entityManager.merge(order);
    }

    @Transactional
    public void save(Order o) {
        entityManager.persist(o);
    }
}
