package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class View {
	
	private ViewTypeEnum type;
	private boolean autoRefresh;
	private boolean isDefault;
	
	private ViewDescription description;
	private DataSource datasource;
	private Layout layout;
	
	@XmlAttribute
	public ViewTypeEnum getType() {
		return type;
	}
	
	public void setType(ViewTypeEnum type) {
		this.type = type;
	}
	
	@XmlAttribute
	public boolean isAutoRefresh() {
		return autoRefresh;
	}
	
	public void setAutoRefresh(boolean autoRefresh) {
		this.autoRefresh = autoRefresh;
	}
	@XmlAttribute
	public boolean isDefault() {
		return isDefault;
	}
	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	
	public ViewDescription getDescription() {
		return description;
	}
	public void setDescription(ViewDescription description) {
		this.description = description;
	}
	
	public DataSource getDatasource() {
		return datasource;
	}
	
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	public Layout getLayout() {
		return layout;
	}
	
	public void setLayout(Layout layout) {
		this.layout = layout;
	}
}
