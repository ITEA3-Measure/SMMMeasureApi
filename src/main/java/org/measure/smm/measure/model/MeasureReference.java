package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class MeasureReference {
	
	private String measureRef;
	
	private FieldType fieldType; 
	
	private String role;
	
	private int number;
	
	private String filter;
	
	@XmlAttribute
	public String getMeasureRef() {
		return measureRef;
	}

	public void setMeasureRef(String measureRef) {
		this.measureRef = measureRef;
	}


	@XmlAttribute
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@XmlAttribute
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@XmlAttribute
	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}
	
	@XmlAttribute
	public FieldType getFieldType() {
		return fieldType;
	}
	
	public void setFieldType(FieldType fieldType) {
		this.fieldType = fieldType;
	}
	
	
}
