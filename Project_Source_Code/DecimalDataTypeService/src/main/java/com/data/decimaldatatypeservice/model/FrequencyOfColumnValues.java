package com.data.decimaldatatypeservice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FrequencyOfColumnValues {

	private String columnDistinctValue;
	private Long columnDistinctValueOccurance;
	
}