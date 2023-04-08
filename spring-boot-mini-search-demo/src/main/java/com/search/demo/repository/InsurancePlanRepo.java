package com.search.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.search.demo.entity.InsurancePlan;

public interface InsurancePlanRepo extends JpaRepository<InsurancePlan, Integer> {

}
