package org.measure.smm.application.model;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMeasures {
	
	private List<ApplicationMeasure> measure;
	
	public ApplicationMeasures() {
		this.measure = new ArrayList<>();
	}

	public List<ApplicationMeasure> getMeasure() {
		return measure;
	}

	public void setMeasure(List<ApplicationMeasure> measure) {
		this.measure = measure;
	}
}
