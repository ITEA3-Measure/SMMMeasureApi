package org.measure.smm.measure.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Measure")
public class SMMMeasure {
	
	private String name;
		
	private MeasureType type;
	
	private MeasureUnit unit;
	
	private String description;
	
	private String agentId;
	
	private String category;
	
	private String provider;
					
	private List<ScopeProperty> scopeProperties;
	private List<MeasureReference> references;
	private Views views;

	
	public SMMMeasure(){
		this.references = new ArrayList<>(); 
	}

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
	public MeasureType getType() {
		return type;
	}
	
	public void setType(MeasureType type) {
		this.type = type;
	}
	
	@XmlAttribute
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	@XmlAttribute
	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public MeasureUnit getUnit() {
		return unit;
	}

	public void setUnit(MeasureUnit unit) {
		this.unit = unit;
	}

	public List<MeasureReference> getReferences() {
		return references;
	}

	public void setReferences(List<MeasureReference> references) {
		this.references = references;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public List<ScopeProperty> getScopeProperties() {
		return scopeProperties;
	}

	public void setScopeProperties(List<ScopeProperty> scopeProperties) {
		this.scopeProperties = scopeProperties;
	}

	public Views getViews() {
		return views;
	}

	public void setViews(Views views) {
		this.views = views;
	}
	
	
	public ScopeProperty findPropertyByName(String name) {
		for(ScopeProperty prop : scopeProperties) {
			if(prop.getName().equals(name)) {
				return prop;
			}
		}
		
		return null;
	}
}
