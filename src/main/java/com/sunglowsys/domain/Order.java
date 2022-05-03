package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private double Amount;

    @Column(name = "orderDate")
    private String OrderDate;


    public Order(){

    }

    public Order(double amount, String orderDate) {
        Amount = amount;
        OrderDate = orderDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.Amount, Amount) == 0 && Objects.equals(id, order.id) && Objects.equals(OrderDate, order.OrderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Amount, OrderDate);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", Amount=" + Amount +
                ", OrderDate='" + OrderDate + '\'' +
                '}';
    }
}
