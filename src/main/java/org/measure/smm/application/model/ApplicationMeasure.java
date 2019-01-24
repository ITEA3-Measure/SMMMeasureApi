package org.measure.smm.application.model;

import javax.xml.bind.annotation.XmlAttribute;

public class ApplicationMeasure {
	
	private String name;
	
	private String scheduling;
	
	private String schedulingUnit;

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute
	public String getScheduling() {
		return scheduling;
	}
	
	public void setScheduling(String scheduling) {
		this.scheduling = scheduling;
	}

	@XmlAttribute
	public String getSchedulingUnit() {
		return schedulingUnit;
	}

	public void setSchedulingUnit(String schedulingUnit) {
		this.schedulingUnit = schedulingUnit;
	}
	
	
}
