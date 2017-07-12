package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class ScopePropertyEnumValue {
	
	private String label;
	private String value;
	
	@XmlAttribute
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@XmlAttribute
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}	
}
