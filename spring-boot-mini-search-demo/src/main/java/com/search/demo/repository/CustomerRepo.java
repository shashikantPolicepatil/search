package com.search.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.search.demo.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
