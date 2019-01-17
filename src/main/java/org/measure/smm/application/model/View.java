package org.measure.smm.application.model;

import javax.xml.bind.annotation.XmlAttribute;

public class View {

	private String name;

	private String scheduling;

	
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
}
