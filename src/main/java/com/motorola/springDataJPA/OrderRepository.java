package com.motorola.springDataJPA;

import org.springframework.data.repository.CrudRepository;


public interface OrderRepository extends CrudRepository<Order, Long> {

    Order findByOrderId(Long orderId);
}
