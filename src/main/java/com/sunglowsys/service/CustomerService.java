package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;

import java.util.List;

public interface CustomerService {

    void save(Customer customer);

    void update(Customer customer,long id);

    List<Customer> findAll();

    Customer findAll(Long id);

    void delete(Long id);
}
