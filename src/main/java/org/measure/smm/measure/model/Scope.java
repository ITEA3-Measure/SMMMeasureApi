package org.measure.smm.measure.model;

import java.util.ArrayList;
import java.util.List;

public class Scope {
	
	private List<ScopeProperty> property;
		
	public Scope(){
		this.property = new ArrayList<>();
	}

	public List<ScopeProperty> getProperty() {
		return property;
	}

	public void setProperty(List<ScopeProperty> property) {
		this.property = property;
	}

}
