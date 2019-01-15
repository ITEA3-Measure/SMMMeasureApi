package org.measure.smm.measurementapplication.model;

import java.util.ArrayList;
import java.util.List;

public class Measures {
	private List<Measure> measure;
	
	public Measures() {
		this.measure = new ArrayList<Measure>();
	}
	
	public List<Measure> getMeasure(){
		return this.measure;
	}
	
	public void setMeasure(List<Measure> measure){
		this.measure = measure;
	}
}
