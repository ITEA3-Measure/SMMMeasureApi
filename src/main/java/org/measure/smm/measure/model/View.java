package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class View {
	
	private String name;
	private String description;
	private ViewTypeEnum type;
	private boolean autoRefresh;
	private boolean isDefault;
	private DataSource datasource;
	private Layout layout;
	private String customData;
	
	
	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
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

	public String getCustomData() {
		return customData;
	}

	public void setCustomData(String customData) {
		this.customData = customData;
	}
}
