package org.measure.smm.measure.model;

import java.util.ArrayList;
import java.util.List;

public class Views {
	
	private List<View> view;
	
	public Views() {
		this.view = new ArrayList<>();
	}

	public List<View> getView() {
		return view;
	}

	public void setView(List<View> view) {
		this.view = view;
	}
}
