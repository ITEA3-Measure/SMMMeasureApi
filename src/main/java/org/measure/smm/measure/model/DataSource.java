package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlAttribute;

public class DataSource {

	private String dataIndex;
	private String dateIndex;
	private String timePeriode;
	private String timeAggreation;

	@XmlAttribute
	public String getDataIndex() {
		return dataIndex;
	}

	public void setDataIndex(String dataIndex) {
		this.dataIndex = dataIndex;
	}

	@XmlAttribute
	public String getDateIndex() {
		return dateIndex;
	}

	public void setDateIndex(String dateIndex) {
		this.dateIndex = dateIndex;
	}

	@XmlAttribute
	public String getTimePeriode() {
		return timePeriode;
	}

	public void setTimePeriode(String timePeriode) {
		this.timePeriode = timePeriode;
	}

	@XmlAttribute
	public String getTimeAggreation() {
		return timeAggreation;
	}

	public void setTimeAggreation(String timeAggreation) {
		this.timeAggreation = timeAggreation;
	}

}
