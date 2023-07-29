package org.study.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.study.models.Order;
import org.study.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Transactional
@ApplicationScoped
public class OrderService {

    @Inject
    private OrderRepository repository;

    public Order save(Order order) {
        return repository.save(order);
    }

    public List<Order> findAll() {
        return (List<Order>) repository.findAll();
    }

    public Optional<Order> find(UUID id) {
        return Optional.ofNullable(repository.find(id).orElseThrow());
    }

}
