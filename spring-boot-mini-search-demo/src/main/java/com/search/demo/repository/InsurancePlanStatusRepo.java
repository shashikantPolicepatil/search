package com.search.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.search.demo.entity.InsurancePlanStatus;


public interface InsurancePlanStatusRepo extends JpaRepository<InsurancePlanStatus, Integer> {

}
