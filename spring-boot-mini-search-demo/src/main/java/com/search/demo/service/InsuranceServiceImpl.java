package com.search.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.search.demo.dto.CustomerPlanDetailsDTO;
import com.search.demo.entity.InsurancePlan;
import com.search.demo.entity.InsurancePlanStatus;
import com.search.demo.repository.CustomerPlanRepo;
import com.search.demo.repository.InsurancePlanRepo;
import com.search.demo.repository.InsurancePlanStatusRepo;
import com.search.demo.request.CustomerSearchRequest;

@Service
public class InsuranceServiceImpl {

	@Autowired
	private CustomerPlanRepo customerPlanRepo;
	
	@Autowired
	private InsurancePlanRepo planRepo;
	
	@Autowired
	private InsurancePlanStatusRepo planStatusRepo;
	
	public List<CustomerPlanDetailsDTO> getDetails(CustomerSearchRequest request) {
		return null;
	}
	
	public List<InsurancePlan> getPlans() {
		return planRepo.findAll();
	}
	
	public List<InsurancePlanStatus> getStatus() {
		return planStatusRepo.findAll();
	}
}
