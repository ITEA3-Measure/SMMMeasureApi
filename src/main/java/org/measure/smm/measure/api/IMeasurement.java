package org.measure.smm.measure.api;

import java.util.Map;


public interface IMeasurement {
	public Map<String, Object> getValues();
    public String getLabel();
}
