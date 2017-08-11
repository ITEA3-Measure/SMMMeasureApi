package org.measure.smm.measure.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

public class MeasureUnit {
	
	private String name;
	private List<MeasureUnitField> fields = new ArrayList<>();
	
	public MeasureUnit(){

	}
	
	@XmlAttribute
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<MeasureUnitField> getFields() {
		return fields;
	}
	public void setFields(List<MeasureUnitField> fields) {
		this.fields = fields;
	}
}
