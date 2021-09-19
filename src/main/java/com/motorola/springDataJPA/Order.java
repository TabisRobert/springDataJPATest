package com.motorola.springDataJPA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;
    private LocalDateTime date;
    private BigInteger price;

    public Order() {
    }

    public Order(LocalDateTime date, BigInteger price) {
        this.date = date;
        this.price = price;
    }

    public Long getOrderId() {
        return orderId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BigInteger getPrice() {
        return price;
    }
}
