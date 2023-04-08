package com.search.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.search.demo.dto.CustomerPlanDetailsDTO;
import com.search.demo.dto.ResponseData;
import com.search.demo.entity.InsurancePlan;
import com.search.demo.entity.InsurancePlanStatus;
import com.search.demo.request.CustomerSearchRequest;
import com.search.demo.service.InsuranceServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class InsuranceSearchOpnResource {

	@Autowired
	private InsuranceServiceImpl insuranceServiceImpl;
	
	@GetMapping("/plans")
	public ResponseEntity<ResponseData> getPlans() {
		List<InsurancePlan> plans = insuranceServiceImpl.getPlans();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("plans", plans);
		return new ResponseEntity<ResponseData>(new ResponseData(HttpStatus.OK.toString(), data, ""), HttpStatus.OK);
	}
	
	@GetMapping("/planstatus")
	public ResponseEntity<ResponseData> getStatus() {
		List<InsurancePlanStatus> status = insuranceServiceImpl.getStatus();
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("planStatus", status);
		return new ResponseEntity<ResponseData>(new ResponseData(HttpStatus.OK.toString(), data, ""), HttpStatus.OK);
	}
	
	@PostMapping("/customerdata/")
	public ResponseEntity<ResponseData> getData(@RequestBody CustomerSearchRequest searchRequest) {
		List<CustomerPlanDetailsDTO> details = insuranceServiceImpl.getDetails(searchRequest);
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("customerData", details);
		return new ResponseEntity<ResponseData>(new ResponseData(HttpStatus.OK.toString(), data, ""), HttpStatus.OK);
	}
	
	
}
