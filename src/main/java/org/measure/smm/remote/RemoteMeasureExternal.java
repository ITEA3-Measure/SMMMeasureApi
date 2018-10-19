package org.measure.smm.remote;

import java.util.Date;

public class RemoteMeasureExternal extends RemoteMeasureInstance {

	private Date alternateDate;
		
	private String dateField;

	public Date getAlternateDate() {
		return alternateDate;
	}

	public void setAlternateDate(Date alternateDate) {
		this.alternateDate = alternateDate;
	}

	public String getDateField() {
		return dateField;
	}

	public void setDateField(String dateField) {
		this.dateField = dateField;
	}

}
