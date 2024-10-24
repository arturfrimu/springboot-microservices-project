package com.programming.techie.orderservice.repository;

import com.programming.techie.orderservice.model.Order;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static lombok.AccessLevel.PRIVATE;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class OrderRepository {

    static Map<Long, Order> orders = new HashMap<>();

    public void save(Order order) {
        orders.put(order.getId(), order);
    }
}