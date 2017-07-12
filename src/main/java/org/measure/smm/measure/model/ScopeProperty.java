package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class ScopeProperty {
	
	private String name;

	private String defaultValue;
	
	private String description;
	
	private ScopePropertyType type;
	
	private ScopePropertyEnum enumType;
	
	@XmlAttribute	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlAttribute
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	@XmlAttribute
	public ScopePropertyType getType() {
		return type;
	}
	public void setType(ScopePropertyType type) {
		this.type = type;
	}
	
	public ScopePropertyEnum getEnumType() {
		return enumType;
	}
	public void setEnumType(ScopePropertyEnum enumType) {
		this.enumType = enumType;
	}
}
