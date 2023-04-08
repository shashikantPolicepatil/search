package com.search.demo.config;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.search.demo.entity.InsurancePlan;
import com.search.demo.entity.InsurancePlanStatus;
import com.search.demo.repository.CustomerRepo;
import com.search.demo.repository.InsurancePlanRepo;
import com.search.demo.repository.InsurancePlanStatusRepo;

@Component
public class InsertData implements CommandLineRunner {

	@Autowired
	private InsurancePlanRepo planRepo;
	
	@Autowired
	private InsurancePlanStatusRepo planStatusRepo;
	
	@Autowired
	private CustomerRepo customerRepo;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Cash / Food / Medical / Employment Plan Status: Approved / Denied /
		 * Terminated Gender: Male
		 */
		List<InsurancePlan> planList = Arrays.asList(new InsurancePlan(0, "CASH", "Cash"),
				new InsurancePlan(0, "FOOD", "Food"), new InsurancePlan(0, "MEDICAL", "Medical"),
				new InsurancePlan(0, "EMPLOYMENT", "Employment"));
		List<InsurancePlanStatus> planStatusList = Arrays.asList(new InsurancePlanStatus(0, "APPROVED", "Approved"),
				new InsurancePlanStatus(0, "DENIED", "Denied"), new InsurancePlanStatus(0, "TERMINATED", "Terminated"));
		planStatusRepo.saveAll(planStatusList);
		planRepo.saveAll(planList);
	}

}
