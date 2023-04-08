package com.search.demo.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerPlanDetailsDTO {

	private Integer customerPlanId;
	private Integer customerId;
	private String name;
	private char gender;
	private String planName;
	private String planStatus;
	private Date planStartDate;
	private Date planEndDate;
	private BigDecimal benefitAmount;
	private String denialReason;
	private Date terminatedDate;
	private Date terminatedReason;
	
	
	
}
