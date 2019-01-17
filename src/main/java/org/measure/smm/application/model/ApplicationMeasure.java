package org.measure.smm.application.model;

import javax.xml.bind.annotation.XmlAttribute;

public class ApplicationMeasure {
	
	private String name;
	
	private String scheduling;

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScheduling() {
		return scheduling;
	}

	@XmlAttribute
	public void setScheduling(String scheduling) {
		this.scheduling = scheduling;
	}
	
}
