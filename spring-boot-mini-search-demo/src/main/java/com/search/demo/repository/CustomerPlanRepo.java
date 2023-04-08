package com.search.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.search.demo.entity.CustomerPlan;

public interface CustomerPlanRepo extends JpaRepository<CustomerPlan,Integer>{

}
