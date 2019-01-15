package org.measure.smm.measurementapplication.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Application")
public class SMMApplication {
	
	private String name;
	
		
	private String provider;
	
	private String description;

	private Dashboards dashboards;
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlAttribute
	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Dashboards getDashboards() {
		return dashboards;
	}
	
	public void setDashboards(Dashboards dashboards) {
		this.dashboards = dashboards;
	}
}
