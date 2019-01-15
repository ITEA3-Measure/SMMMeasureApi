package org.measure.smm.measurementapplication.model;

import java.util.ArrayList;
import java.util.List;

public class Dashboards {

	private List<Dashboard> dashboard;
	
	public Dashboards() {
		this.dashboard = new ArrayList<Dashboard>();
	}
	
	public List<Dashboard> getDashboard(){
		return this.dashboard;
	}
	
	public void setDashboard(List<Dashboard> dashboard){
		this.dashboard = dashboard;
	}
}
