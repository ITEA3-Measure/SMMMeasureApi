package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class MeasureUnitField {
	
	private String fieldName;
	private FieldType fieldType;
	private MeasureUnit subtype;
	
	@XmlAttribute(required=false)
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	@XmlAttribute
	public FieldType getFieldType() {
		return fieldType;
	}
	public void setFieldType(FieldType fieldType) {
		this.fieldType = fieldType;
	}
	
	public MeasureUnit getSubtype() {
		return subtype;
	}
	public void setSubtype(MeasureUnit subtype) {
		this.subtype = subtype;
	}
	
	

}
