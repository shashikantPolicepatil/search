package com.search.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="TBL_PLAN_STATUS")
public class InsurancePlanStatus {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String planStatusCode;
	private String planStatusName;
}
