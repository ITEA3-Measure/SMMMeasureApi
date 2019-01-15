package org.measure.smm.measurementapplication.api;

import java.util.List;
import java.util.Map;

import org.measure.smm.measure.api.IMeasurement;

public interface IMeasurementApplication {
	public Map<String,String> getProperties();
	public List<IMeasurement> getMeasurement() throws Exception;

}
