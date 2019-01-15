package org.measure.smm.measurementapplication.model;

import javax.xml.bind.annotation.XmlAttribute;

public class Dashboard {

	private String label;
		
	private Measures measures;
	
	@XmlAttribute
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}

	
	public Measures getMeasures() {
		return measures;
	}
	
	public void setMeasures(Measures measures) {
		this.measures = measures;
	}

}
