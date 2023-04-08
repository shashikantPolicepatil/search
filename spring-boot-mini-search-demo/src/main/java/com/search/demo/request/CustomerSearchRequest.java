package com.search.demo.request;

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
public class CustomerSearchRequest {
	private String planName;
	private String planStatus;
	private char gender;
	private Date planStartDate;
	private Date planEndDate;
	private String exportType;
}
