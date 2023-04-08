package com.search.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="TBL_CUSTOMER_PLAN")
public class CustomerPlan {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer customerPlanId;
	private Date planStartDate;
	private Date planEndDate;
	private BigDecimal benefitAmount;
	private String denialReason;
	private Date terminatedDate;
	private Date terminatedReason;
	
	/*@OneToMany
	private Set<InsurancePlan> planName;
	@OneToMany
	@JoinColumn(name="plan_status_id")
	private Set<InsurancePlanStatus> planStatus;
	@OneToMany
	@JoinColumn(name="customer_id")
	private Set<Customer> customerPlans;*/
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer customer;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="plan_id")
	private InsurancePlan plan;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="plan_status_id")
	private InsurancePlanStatus planStatus;
}
