package com.example.orderservice.controller;

import com.example.orderservice.enitity.Order;
import com.example.orderservice.enitity.Sequence;
import com.example.orderservice.repositories.OrderRepository;
import com.example.orderservice.service.SequenceGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    @Autowired
    private SequenceGenerator sequenceGenerator;

    @RequestMapping(path = "/save", method = RequestMethod.POST)
    public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
        order.setId(sequenceGenerator.getNextSequence());
        Optional<Order> response = Optional.of(orderRepo.save(order));
        if (response.isPresent()) {
            return ResponseEntity.ok(response.get());
        } else {
            return new ResponseEntity<>(null, HttpStatus.OK);
        }

    }

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

}
