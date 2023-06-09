package com.example.orderservice.repositories;

import com.example.orderservice.enitity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends MongoRepository<Order, Long> {
}
