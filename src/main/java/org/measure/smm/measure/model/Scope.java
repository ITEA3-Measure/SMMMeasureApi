package org.measure.smm.measure.model;

import java.util.ArrayList;
import java.util.List;

public class Scope {
	
	private List<ScopeProperty> scopeProperties;
		
	public Scope(){
		this.scopeProperties = new ArrayList<>();
	}

	public List<ScopeProperty> getScopeProperties() {
		return scopeProperties;
	}

	public void setScopeProperties(List<ScopeProperty> scopeProperties) {
		this.scopeProperties = scopeProperties;
	}
}
