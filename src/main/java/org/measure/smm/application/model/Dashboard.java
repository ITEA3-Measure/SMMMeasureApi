package org.measure.smm.application.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

public class Dashboard {

	private String label;
		
	private List<View> view;
	
	public Dashboard() {
		this.view = new ArrayList<>();
	}
	
	@XmlAttribute
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}

	public List<View> getView() {
		return view;
	}

	public void setView(List<View> view) {
		this.view = view;
	}
}


