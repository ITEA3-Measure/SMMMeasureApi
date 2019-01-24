package org.measure.smm.application.model;

import javax.xml.bind.annotation.XmlAttribute;

public class View {

	private String measure;

	private String view;

	
	@XmlAttribute
	public String getMeasure() {
		return measure;
	}
	
	public void setMeasure(String measure) {
		this.measure = measure;
	}	
	
	@XmlAttribute
	public String getView() {
		return view;
	}
	
	public void setView(String view) {
		this.view = view;
	}
}
