package com.data.patternidentification.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class DataProfilerInfo {
	String fileName;
	List<DatasetStats> datasetStats;
	
}
