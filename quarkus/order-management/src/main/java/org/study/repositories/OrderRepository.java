package org.study.repositories;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import jakarta.enterprise.context.ApplicationScoped;
import org.study.models.Order;

import java.util.Optional;
import java.util.UUID;

@ApplicationScoped
public class OrderRepository {
    public Order save(Order order) {
        order.persist();
        return order;
    }

    public Optional<Order> find(UUID id) {
        return Order.findByIdOptional(id);
    }

    public PanacheQuery<PanacheEntityBase> findAll() {
        return Order.findAll();
    }

}
